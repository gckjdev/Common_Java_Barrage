// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Error.proto

package com.orange.protocol.message;

public final class ErrorProtos {
  private ErrorProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code barrage.PBError}
   */
  public enum PBError
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ERROR_READ_POST_DATA = 1000001;</code>
     *
     * <pre>
     * system
     * </pre>
     */
    ERROR_READ_POST_DATA(0, 1000001),
    /**
     * <code>ERROR_PARSE_POST_DATA = 1000002;</code>
     */
    ERROR_PARSE_POST_DATA(1, 1000002),
    /**
     * <code>ERROR_NO_SERVICE_FOR_TYPE = 1000003;</code>
     */
    ERROR_NO_SERVICE_FOR_TYPE(2, 1000003),
    /**
     * <code>ERROR_SERVICE_CATCH_EXCEPTION = 1000004;</code>
     */
    ERROR_SERVICE_CATCH_EXCEPTION(3, 1000004),
    /**
     * <code>ERROR_USER_LOGIN_UNKNOWN_TYPE = 2000001;</code>
     *
     * <pre>
     * user
     * </pre>
     */
    ERROR_USER_LOGIN_UNKNOWN_TYPE(4, 2000001),
    /**
     * <code>ERROR_USER_LOGIN_INFO_EMPTY = 2000002;</code>
     */
    ERROR_USER_LOGIN_INFO_EMPTY(5, 2000002),
    /**
     * <code>ERROR_USER_REGISTER_UNKNOWN_TYPE = 2000003;</code>
     */
    ERROR_USER_REGISTER_UNKNOWN_TYPE(6, 2000003),
    /**
     * <code>ERROR_USER_REGISTER_INFO_EMPTY = 2000004;</code>
     */
    ERROR_USER_REGISTER_INFO_EMPTY(7, 2000004),
    /**
     * <code>ERROR_USER_REGISTER_INVALID_INVITE_CODE = 2000005;</code>
     */
    ERROR_USER_REGISTER_INVALID_INVITE_CODE(8, 2000005),
    /**
     * <code>ERROR_USER_NOT_FOUND = 2000006;</code>
     */
    ERROR_USER_NOT_FOUND(9, 2000006),
    /**
     * <code>ERROR_FRIEND_NOT_FOUND = 2000007;</code>
     */
    ERROR_FRIEND_NOT_FOUND(10, 2000007),
    /**
     * <code>ERROR_FRIEND_NOT_ALLOW_ADD_ME = 2000008;</code>
     */
    ERROR_FRIEND_NOT_ALLOW_ADD_ME(11, 2000008),
    /**
     * <code>ERROR_FEED_ACTION_INVALID = 3000001;</code>
     *
     * <pre>
     * feed
     * </pre>
     */
    ERROR_FEED_ACTION_INVALID(12, 3000001),
    ;

    /**
     * <code>ERROR_READ_POST_DATA = 1000001;</code>
     *
     * <pre>
     * system
     * </pre>
     */
    public static final int ERROR_READ_POST_DATA_VALUE = 1000001;
    /**
     * <code>ERROR_PARSE_POST_DATA = 1000002;</code>
     */
    public static final int ERROR_PARSE_POST_DATA_VALUE = 1000002;
    /**
     * <code>ERROR_NO_SERVICE_FOR_TYPE = 1000003;</code>
     */
    public static final int ERROR_NO_SERVICE_FOR_TYPE_VALUE = 1000003;
    /**
     * <code>ERROR_SERVICE_CATCH_EXCEPTION = 1000004;</code>
     */
    public static final int ERROR_SERVICE_CATCH_EXCEPTION_VALUE = 1000004;
    /**
     * <code>ERROR_USER_LOGIN_UNKNOWN_TYPE = 2000001;</code>
     *
     * <pre>
     * user
     * </pre>
     */
    public static final int ERROR_USER_LOGIN_UNKNOWN_TYPE_VALUE = 2000001;
    /**
     * <code>ERROR_USER_LOGIN_INFO_EMPTY = 2000002;</code>
     */
    public static final int ERROR_USER_LOGIN_INFO_EMPTY_VALUE = 2000002;
    /**
     * <code>ERROR_USER_REGISTER_UNKNOWN_TYPE = 2000003;</code>
     */
    public static final int ERROR_USER_REGISTER_UNKNOWN_TYPE_VALUE = 2000003;
    /**
     * <code>ERROR_USER_REGISTER_INFO_EMPTY = 2000004;</code>
     */
    public static final int ERROR_USER_REGISTER_INFO_EMPTY_VALUE = 2000004;
    /**
     * <code>ERROR_USER_REGISTER_INVALID_INVITE_CODE = 2000005;</code>
     */
    public static final int ERROR_USER_REGISTER_INVALID_INVITE_CODE_VALUE = 2000005;
    /**
     * <code>ERROR_USER_NOT_FOUND = 2000006;</code>
     */
    public static final int ERROR_USER_NOT_FOUND_VALUE = 2000006;
    /**
     * <code>ERROR_FRIEND_NOT_FOUND = 2000007;</code>
     */
    public static final int ERROR_FRIEND_NOT_FOUND_VALUE = 2000007;
    /**
     * <code>ERROR_FRIEND_NOT_ALLOW_ADD_ME = 2000008;</code>
     */
    public static final int ERROR_FRIEND_NOT_ALLOW_ADD_ME_VALUE = 2000008;
    /**
     * <code>ERROR_FEED_ACTION_INVALID = 3000001;</code>
     *
     * <pre>
     * feed
     * </pre>
     */
    public static final int ERROR_FEED_ACTION_INVALID_VALUE = 3000001;


    public final int getNumber() { return value; }

    public static PBError valueOf(int value) {
      switch (value) {
        case 1000001: return ERROR_READ_POST_DATA;
        case 1000002: return ERROR_PARSE_POST_DATA;
        case 1000003: return ERROR_NO_SERVICE_FOR_TYPE;
        case 1000004: return ERROR_SERVICE_CATCH_EXCEPTION;
        case 2000001: return ERROR_USER_LOGIN_UNKNOWN_TYPE;
        case 2000002: return ERROR_USER_LOGIN_INFO_EMPTY;
        case 2000003: return ERROR_USER_REGISTER_UNKNOWN_TYPE;
        case 2000004: return ERROR_USER_REGISTER_INFO_EMPTY;
        case 2000005: return ERROR_USER_REGISTER_INVALID_INVITE_CODE;
        case 2000006: return ERROR_USER_NOT_FOUND;
        case 2000007: return ERROR_FRIEND_NOT_FOUND;
        case 2000008: return ERROR_FRIEND_NOT_ALLOW_ADD_ME;
        case 3000001: return ERROR_FEED_ACTION_INVALID;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PBError>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<PBError>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PBError>() {
            public PBError findValueByNumber(int number) {
              return PBError.valueOf(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(index);
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return com.orange.protocol.message.ErrorProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final PBError[] VALUES = values();

    public static PBError valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private PBError(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:barrage.PBError)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Error.proto\022\007barrage*\316\003\n\007PBError\022\032\n\024ER" +
      "ROR_READ_POST_DATA\020\301\204=\022\033\n\025ERROR_PARSE_PO" +
      "ST_DATA\020\302\204=\022\037\n\031ERROR_NO_SERVICE_FOR_TYPE" +
      "\020\303\204=\022#\n\035ERROR_SERVICE_CATCH_EXCEPTION\020\304\204" +
      "=\022#\n\035ERROR_USER_LOGIN_UNKNOWN_TYPE\020\201\211z\022!" +
      "\n\033ERROR_USER_LOGIN_INFO_EMPTY\020\202\211z\022&\n ERR" +
      "OR_USER_REGISTER_UNKNOWN_TYPE\020\203\211z\022$\n\036ERR" +
      "OR_USER_REGISTER_INFO_EMPTY\020\204\211z\022-\n\'ERROR" +
      "_USER_REGISTER_INVALID_INVITE_CODE\020\205\211z\022\032" +
      "\n\024ERROR_USER_NOT_FOUND\020\206\211z\022\034\n\026ERROR_FRIE",
      "ND_NOT_FOUND\020\207\211z\022#\n\035ERROR_FRIEND_NOT_ALL" +
      "OW_ADD_ME\020\210\211z\022 \n\031ERROR_FEED_ACTION_INVAL" +
      "ID\020\301\215\267\001B*\n\033com.orange.protocol.messageB\013" +
      "ErrorProtos"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
  }

  // @@protoc_insertion_point(outer_class_scope)
}
