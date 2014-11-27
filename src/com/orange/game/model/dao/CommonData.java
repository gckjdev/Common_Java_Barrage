package com.orange.game.model.dao;

import java.util.*;

import com.mongodb.BasicDBList;
import com.orange.game.constants.DBConstants;
import com.orange.game.model.dao.common.IntKeyValue;
import com.orange.game.model.dao.common.UserAward;
import org.apache.log4j.Logger;
import org.bson.types.ObjectId;

import net.sf.json.JSONObject;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

public class CommonData {

	DBObject dbObject;
	public static final Logger log = Logger.getLogger(CommonData.class.getName());
	

	public CommonData() {
		dbObject = new BasicDBObject();
	}

	public CommonData(DBObject dbObject) {
		this.dbObject = dbObject;
	}

	public DBObject getDbObject() {
		return dbObject;
	}

	public void setDbObject(DBObject dbObject) {
		this.dbObject = dbObject;
	}

	public String toString() {
		return dbObject.toMap().toString();
	}

	public void put(String key, String value) {
		dbObject.put(key, value);
	}

	public void put(String key, Object value) {
		dbObject.put(key, value);
	}
	
	public void put(String key, int value) {
		dbObject.put(key, Integer.valueOf(value));
	}

	public void put(String key, double value) {
		dbObject.put(key, Double.valueOf(value));
	}

	public void put(String key, Date value) {
		dbObject.put(key, value);
	}

	public void put(String key, List<?> list) {
		dbObject.put(key, list);
	}

	public void put(String key, boolean value) {
		dbObject.put(key, value);
	}

	public String getString(String key) {
		return (String) dbObject.get(key);
	}

	public int getInt(String key) {
		Object obj = dbObject.get(key);
		if (obj == null) {
			return 0;
		} else if (obj instanceof Integer) {
			return ((Integer) obj).intValue();
		} else if (obj instanceof Double) {
			return ((Double) obj).intValue();
		} else {
			return 0;
		}
	}

    public long getLong(String key) {
        Object obj = dbObject.get(key);
        if (obj == null) {
            return 0;
        }
        else if (obj instanceof Integer) {
            return ((Integer) obj).longValue();
        }
        else if (obj instanceof Long) {
            return ((Long) obj).longValue();
        }
        else if (obj instanceof Double) {
            return ((Double) obj).longValue();
        }
        else {
            return 0;
        }
    }

	public double getDouble(String key) {
        Object obj = dbObject.get(key);
        if (obj == null){
            return 0.0f;
        }

        if (obj instanceof Double){
            return ((Double) obj).doubleValue();
        }

        if (obj instanceof Integer){
            return ((Integer) obj).intValue();
        }

		return 0.0f;
	}

	public boolean getBoolean(String key) {
		Object obj = dbObject.get(key);
		if (obj != null && obj instanceof Boolean) {
			return ((Boolean) obj).booleanValue();
		}
		return false;
	}

	public float getFloat(String key) {
		Double value = (Double) dbObject.get(key);
		if (value == null)
			return 0.0f;

		return value.floatValue();
	}

	public Date getDate(String key) {
		Date value = (Date) dbObject.get(key);
		return value;
	}

    public int getIntDate(String key) {
        Date value = (Date) dbObject.get(key);
        if (value != null)
            return (int)(value.getTime()/1000);
        else
            return 0;
    }


    public <T> List<T> getList(String key, Class<T> clazz){
        BasicDBList list = getList(key);
        if (list != null && !list.isEmpty()){
            int count = list.size();
            List<T> retlist = new ArrayList<T>(count);
            for (int i = 0; i < count; ++ i){
                T obj = (T) list.get(i);
                retlist.add(obj);
            }
            return retlist;
        }
        return Collections.emptyList();

    }

    public BasicDBList getList(String key) {
        return (BasicDBList) dbObject.get(key);
    }



    @SuppressWarnings("unchecked")
	public List<String> getStringList(String key) {
        List<String> list = (List<String>) dbObject.get(key);
        if (list == null)
            return Collections.emptyList();
        else
            return list;
	}

    public Set<String> getStringSet(String key) {
        List<String> list = (List<String>) dbObject.get(key);
        if (list == null || list.size() == 0){
            return Collections.emptySet();
        }
        else{
            HashSet<String> retSet = new HashSet<String>();
            retSet.addAll(list);
            return retSet;
        }
    }

    public Set<Integer> getIntegerSet(String key) {
        List<Integer> list = (List<Integer>) dbObject.get(key);
        if (list == null || list.size() == 0){
            return Collections.emptySet();
        }
        else{
            HashSet<Integer> retSet = new HashSet<Integer>();
            retSet.addAll(list);
            return retSet;
        }
    }

	public Object getObject(String key) {
		return dbObject.get(key);
	}

	public String getStringObjectId() {
        Object id = dbObject.get("_id");
        if (id == null){
            return null;
        }

		return id.toString();
	}

	public ObjectId getObjectId() {
		Object obj = dbObject.get("_id");
		if (obj instanceof ObjectId)
			return (ObjectId) obj;
		else
			return null;
	}

	public ObjectId getObjectId(String key){
		Object obj = dbObject.get(key);
		if (obj instanceof ObjectId)
			return (ObjectId) obj;
		else
			return null;
	}
	
	public JSONObject toJsonObject() {
		JSONObject object = new JSONObject();
		object.putAll(dbObject.toMap());
		return object;
	}

	public void setObjectId(ObjectId objectId) {
		dbObject.put("_id", objectId);
	}

    public List<UserAward> getUserAwardList(String fieldName){
        BasicDBList list = (BasicDBList)getList(fieldName);
        if (list == null){
            return Collections.emptyList();
        }
        else{
            List<UserAward> retList = new ArrayList<UserAward>();
            for (Object obj : list){
                retList.add(new UserAward((BasicDBObject)obj));
            }
            return retList;
        }
    }

    public Map<Integer, String> getIntKeyValueObject(String fieldName){

        BasicDBObject obj = (BasicDBObject)dbObject.get(fieldName);
        if (obj == null)
            return null;

        try{
            Set<String> keySet = obj.keySet();
            Map<Integer, String> map = new HashMap<Integer, String>();
            for (String key : keySet){
                Integer intKey = Integer.parseInt(key);
                map.put(intKey, obj.getString(key));
            }
            return map;
        }
        catch (Exception e){
            log.error(String.format("<getIntKeyValueObject> field=%s, catch exception (%s)", fieldName, e.toString()), e);
            return null;
        }
    }

}
