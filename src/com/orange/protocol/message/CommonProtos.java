// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Common.proto

package com.orange.protocol.message;

public final class CommonProtos {
  private CommonProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  public interface PBDeviceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:barrage.PBDevice)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     * refer to PBDeviceType
     * </pre>
     */
    boolean hasType();
    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     * refer to PBDeviceType
     * </pre>
     */
    int getType();

    /**
     * <code>optional string model = 2;</code>
     */
    boolean hasModel();
    /**
     * <code>optional string model = 2;</code>
     */
    java.lang.String getModel();
    /**
     * <code>optional string model = 2;</code>
     */
    com.google.protobuf.ByteString
        getModelBytes();

    /**
     * <code>optional string os = 3;</code>
     */
    boolean hasOs();
    /**
     * <code>optional string os = 3;</code>
     */
    java.lang.String getOs();
    /**
     * <code>optional string os = 3;</code>
     */
    com.google.protobuf.ByteString
        getOsBytes();

    /**
     * <code>optional string deviceId = 4;</code>
     *
     * <pre>
     * for iPhone
     * </pre>
     */
    boolean hasDeviceId();
    /**
     * <code>optional string deviceId = 4;</code>
     *
     * <pre>
     * for iPhone
     * </pre>
     */
    java.lang.String getDeviceId();
    /**
     * <code>optional string deviceId = 4;</code>
     *
     * <pre>
     * for iPhone
     * </pre>
     */
    com.google.protobuf.ByteString
        getDeviceIdBytes();

    /**
     * <code>optional string deviceToken = 5;</code>
     */
    boolean hasDeviceToken();
    /**
     * <code>optional string deviceToken = 5;</code>
     */
    java.lang.String getDeviceToken();
    /**
     * <code>optional string deviceToken = 5;</code>
     */
    com.google.protobuf.ByteString
        getDeviceTokenBytes();
  }
  /**
   * Protobuf type {@code barrage.PBDevice}
   */
  public static final class PBDevice extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:barrage.PBDevice)
      PBDeviceOrBuilder {
    // Use PBDevice.newBuilder() to construct.
    private PBDevice(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
      this.unknownFields = builder.getUnknownFields();
    }
    private PBDevice(boolean noInit) { this.unknownFields = com.google.protobuf.UnknownFieldSet.getDefaultInstance(); }

    private static final PBDevice defaultInstance;
    public static PBDevice getDefaultInstance() {
      return defaultInstance;
    }

    public PBDevice getDefaultInstanceForType() {
      return defaultInstance;
    }

    private final com.google.protobuf.UnknownFieldSet unknownFields;
    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
        getUnknownFields() {
      return this.unknownFields;
    }
    private PBDevice(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      initFields();
      int mutable_bitField0_ = 0;
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            default: {
              if (!parseUnknownField(input, unknownFields,
                                     extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
            case 8: {
              bitField0_ |= 0x00000001;
              type_ = input.readInt32();
              break;
            }
            case 18: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000002;
              model_ = bs;
              break;
            }
            case 26: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000004;
              os_ = bs;
              break;
            }
            case 34: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000008;
              deviceId_ = bs;
              break;
            }
            case 42: {
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000010;
              deviceToken_ = bs;
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e.getMessage()).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.orange.protocol.message.CommonProtos.internal_static_barrage_PBDevice_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.orange.protocol.message.CommonProtos.internal_static_barrage_PBDevice_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.orange.protocol.message.CommonProtos.PBDevice.class, com.orange.protocol.message.CommonProtos.PBDevice.Builder.class);
    }

    public static com.google.protobuf.Parser<PBDevice> PARSER =
        new com.google.protobuf.AbstractParser<PBDevice>() {
      public PBDevice parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new PBDevice(input, extensionRegistry);
      }
    };

    @java.lang.Override
    public com.google.protobuf.Parser<PBDevice> getParserForType() {
      return PARSER;
    }

    private int bitField0_;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int type_;
    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     * refer to PBDeviceType
     * </pre>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <code>required int32 type = 1;</code>
     *
     * <pre>
     * refer to PBDeviceType
     * </pre>
     */
    public int getType() {
      return type_;
    }

    public static final int MODEL_FIELD_NUMBER = 2;
    private java.lang.Object model_;
    /**
     * <code>optional string model = 2;</code>
     */
    public boolean hasModel() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <code>optional string model = 2;</code>
     */
    public java.lang.String getModel() {
      java.lang.Object ref = model_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          model_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string model = 2;</code>
     */
    public com.google.protobuf.ByteString
        getModelBytes() {
      java.lang.Object ref = model_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        model_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int OS_FIELD_NUMBER = 3;
    private java.lang.Object os_;
    /**
     * <code>optional string os = 3;</code>
     */
    public boolean hasOs() {
      return ((bitField0_ & 0x00000004) == 0x00000004);
    }
    /**
     * <code>optional string os = 3;</code>
     */
    public java.lang.String getOs() {
      java.lang.Object ref = os_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          os_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string os = 3;</code>
     */
    public com.google.protobuf.ByteString
        getOsBytes() {
      java.lang.Object ref = os_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        os_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DEVICEID_FIELD_NUMBER = 4;
    private java.lang.Object deviceId_;
    /**
     * <code>optional string deviceId = 4;</code>
     *
     * <pre>
     * for iPhone
     * </pre>
     */
    public boolean hasDeviceId() {
      return ((bitField0_ & 0x00000008) == 0x00000008);
    }
    /**
     * <code>optional string deviceId = 4;</code>
     *
     * <pre>
     * for iPhone
     * </pre>
     */
    public java.lang.String getDeviceId() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          deviceId_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string deviceId = 4;</code>
     *
     * <pre>
     * for iPhone
     * </pre>
     */
    public com.google.protobuf.ByteString
        getDeviceIdBytes() {
      java.lang.Object ref = deviceId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int DEVICETOKEN_FIELD_NUMBER = 5;
    private java.lang.Object deviceToken_;
    /**
     * <code>optional string deviceToken = 5;</code>
     */
    public boolean hasDeviceToken() {
      return ((bitField0_ & 0x00000010) == 0x00000010);
    }
    /**
     * <code>optional string deviceToken = 5;</code>
     */
    public java.lang.String getDeviceToken() {
      java.lang.Object ref = deviceToken_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          deviceToken_ = s;
        }
        return s;
      }
    }
    /**
     * <code>optional string deviceToken = 5;</code>
     */
    public com.google.protobuf.ByteString
        getDeviceTokenBytes() {
      java.lang.Object ref = deviceToken_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        deviceToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    private void initFields() {
      type_ = 0;
      model_ = "";
      os_ = "";
      deviceId_ = "";
      deviceToken_ = "";
    }
    private byte memoizedIsInitialized = -1;
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      getSerializedSize();
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        output.writeInt32(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeBytes(2, getModelBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        output.writeBytes(3, getOsBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        output.writeBytes(4, getDeviceIdBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        output.writeBytes(5, getDeviceTokenBytes());
      }
      getUnknownFields().writeTo(output);
    }

    private int memoizedSerializedSize = -1;
    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(1, type_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, getModelBytes());
      }
      if (((bitField0_ & 0x00000004) == 0x00000004)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(3, getOsBytes());
      }
      if (((bitField0_ & 0x00000008) == 0x00000008)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, getDeviceIdBytes());
      }
      if (((bitField0_ & 0x00000010) == 0x00000010)) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(5, getDeviceTokenBytes());
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSerializedSize = size;
      return size;
    }

    private static final long serialVersionUID = 0L;
    @java.lang.Override
    protected java.lang.Object writeReplace()
        throws java.io.ObjectStreamException {
      return super.writeReplace();
    }

    public static com.orange.protocol.message.CommonProtos.PBDevice parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.orange.protocol.message.CommonProtos.PBDevice parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.orange.protocol.message.CommonProtos.PBDevice parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.orange.protocol.message.CommonProtos.PBDevice parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.orange.protocol.message.CommonProtos.PBDevice parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.orange.protocol.message.CommonProtos.PBDevice parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }
    public static com.orange.protocol.message.CommonProtos.PBDevice parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input);
    }
    public static com.orange.protocol.message.CommonProtos.PBDevice parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseDelimitedFrom(input, extensionRegistry);
    }
    public static com.orange.protocol.message.CommonProtos.PBDevice parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return PARSER.parseFrom(input);
    }
    public static com.orange.protocol.message.CommonProtos.PBDevice parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return PARSER.parseFrom(input, extensionRegistry);
    }

    public static Builder newBuilder() { return Builder.create(); }
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder(com.orange.protocol.message.CommonProtos.PBDevice prototype) {
      return newBuilder().mergeFrom(prototype);
    }
    public Builder toBuilder() { return newBuilder(this); }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code barrage.PBDevice}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:barrage.PBDevice)
        com.orange.protocol.message.CommonProtos.PBDeviceOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.orange.protocol.message.CommonProtos.internal_static_barrage_PBDevice_descriptor;
      }

      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.orange.protocol.message.CommonProtos.internal_static_barrage_PBDevice_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.orange.protocol.message.CommonProtos.PBDevice.class, com.orange.protocol.message.CommonProtos.PBDevice.Builder.class);
      }

      // Construct using com.orange.protocol.message.CommonProtos.PBDevice.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
        }
      }
      private static Builder create() {
        return new Builder();
      }

      public Builder clear() {
        super.clear();
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000001);
        model_ = "";
        bitField0_ = (bitField0_ & ~0x00000002);
        os_ = "";
        bitField0_ = (bitField0_ & ~0x00000004);
        deviceId_ = "";
        bitField0_ = (bitField0_ & ~0x00000008);
        deviceToken_ = "";
        bitField0_ = (bitField0_ & ~0x00000010);
        return this;
      }

      public Builder clone() {
        return create().mergeFrom(buildPartial());
      }

      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.orange.protocol.message.CommonProtos.internal_static_barrage_PBDevice_descriptor;
      }

      public com.orange.protocol.message.CommonProtos.PBDevice getDefaultInstanceForType() {
        return com.orange.protocol.message.CommonProtos.PBDevice.getDefaultInstance();
      }

      public com.orange.protocol.message.CommonProtos.PBDevice build() {
        com.orange.protocol.message.CommonProtos.PBDevice result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      public com.orange.protocol.message.CommonProtos.PBDevice buildPartial() {
        com.orange.protocol.message.CommonProtos.PBDevice result = new com.orange.protocol.message.CommonProtos.PBDevice(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.type_ = type_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.model_ = model_;
        if (((from_bitField0_ & 0x00000004) == 0x00000004)) {
          to_bitField0_ |= 0x00000004;
        }
        result.os_ = os_;
        if (((from_bitField0_ & 0x00000008) == 0x00000008)) {
          to_bitField0_ |= 0x00000008;
        }
        result.deviceId_ = deviceId_;
        if (((from_bitField0_ & 0x00000010) == 0x00000010)) {
          to_bitField0_ |= 0x00000010;
        }
        result.deviceToken_ = deviceToken_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.orange.protocol.message.CommonProtos.PBDevice) {
          return mergeFrom((com.orange.protocol.message.CommonProtos.PBDevice)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.orange.protocol.message.CommonProtos.PBDevice other) {
        if (other == com.orange.protocol.message.CommonProtos.PBDevice.getDefaultInstance()) return this;
        if (other.hasType()) {
          setType(other.getType());
        }
        if (other.hasModel()) {
          bitField0_ |= 0x00000002;
          model_ = other.model_;
          onChanged();
        }
        if (other.hasOs()) {
          bitField0_ |= 0x00000004;
          os_ = other.os_;
          onChanged();
        }
        if (other.hasDeviceId()) {
          bitField0_ |= 0x00000008;
          deviceId_ = other.deviceId_;
          onChanged();
        }
        if (other.hasDeviceToken()) {
          bitField0_ |= 0x00000010;
          deviceToken_ = other.deviceToken_;
          onChanged();
        }
        this.mergeUnknownFields(other.getUnknownFields());
        return this;
      }

      public final boolean isInitialized() {
        if (!hasType()) {
          
          return false;
        }
        return true;
      }

      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.orange.protocol.message.CommonProtos.PBDevice parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.orange.protocol.message.CommonProtos.PBDevice) e.getUnfinishedMessage();
          throw e;
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private int type_ ;
      /**
       * <code>required int32 type = 1;</code>
       *
       * <pre>
       * refer to PBDeviceType
       * </pre>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <code>required int32 type = 1;</code>
       *
       * <pre>
       * refer to PBDeviceType
       * </pre>
       */
      public int getType() {
        return type_;
      }
      /**
       * <code>required int32 type = 1;</code>
       *
       * <pre>
       * refer to PBDeviceType
       * </pre>
       */
      public Builder setType(int value) {
        bitField0_ |= 0x00000001;
        type_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>required int32 type = 1;</code>
       *
       * <pre>
       * refer to PBDeviceType
       * </pre>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        onChanged();
        return this;
      }

      private java.lang.Object model_ = "";
      /**
       * <code>optional string model = 2;</code>
       */
      public boolean hasModel() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <code>optional string model = 2;</code>
       */
      public java.lang.String getModel() {
        java.lang.Object ref = model_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            model_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string model = 2;</code>
       */
      public com.google.protobuf.ByteString
          getModelBytes() {
        java.lang.Object ref = model_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          model_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string model = 2;</code>
       */
      public Builder setModel(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        model_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string model = 2;</code>
       */
      public Builder clearModel() {
        bitField0_ = (bitField0_ & ~0x00000002);
        model_ = getDefaultInstance().getModel();
        onChanged();
        return this;
      }
      /**
       * <code>optional string model = 2;</code>
       */
      public Builder setModelBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000002;
        model_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object os_ = "";
      /**
       * <code>optional string os = 3;</code>
       */
      public boolean hasOs() {
        return ((bitField0_ & 0x00000004) == 0x00000004);
      }
      /**
       * <code>optional string os = 3;</code>
       */
      public java.lang.String getOs() {
        java.lang.Object ref = os_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            os_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string os = 3;</code>
       */
      public com.google.protobuf.ByteString
          getOsBytes() {
        java.lang.Object ref = os_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          os_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string os = 3;</code>
       */
      public Builder setOs(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        os_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string os = 3;</code>
       */
      public Builder clearOs() {
        bitField0_ = (bitField0_ & ~0x00000004);
        os_ = getDefaultInstance().getOs();
        onChanged();
        return this;
      }
      /**
       * <code>optional string os = 3;</code>
       */
      public Builder setOsBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000004;
        os_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object deviceId_ = "";
      /**
       * <code>optional string deviceId = 4;</code>
       *
       * <pre>
       * for iPhone
       * </pre>
       */
      public boolean hasDeviceId() {
        return ((bitField0_ & 0x00000008) == 0x00000008);
      }
      /**
       * <code>optional string deviceId = 4;</code>
       *
       * <pre>
       * for iPhone
       * </pre>
       */
      public java.lang.String getDeviceId() {
        java.lang.Object ref = deviceId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            deviceId_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string deviceId = 4;</code>
       *
       * <pre>
       * for iPhone
       * </pre>
       */
      public com.google.protobuf.ByteString
          getDeviceIdBytes() {
        java.lang.Object ref = deviceId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          deviceId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string deviceId = 4;</code>
       *
       * <pre>
       * for iPhone
       * </pre>
       */
      public Builder setDeviceId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        deviceId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string deviceId = 4;</code>
       *
       * <pre>
       * for iPhone
       * </pre>
       */
      public Builder clearDeviceId() {
        bitField0_ = (bitField0_ & ~0x00000008);
        deviceId_ = getDefaultInstance().getDeviceId();
        onChanged();
        return this;
      }
      /**
       * <code>optional string deviceId = 4;</code>
       *
       * <pre>
       * for iPhone
       * </pre>
       */
      public Builder setDeviceIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000008;
        deviceId_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object deviceToken_ = "";
      /**
       * <code>optional string deviceToken = 5;</code>
       */
      public boolean hasDeviceToken() {
        return ((bitField0_ & 0x00000010) == 0x00000010);
      }
      /**
       * <code>optional string deviceToken = 5;</code>
       */
      public java.lang.String getDeviceToken() {
        java.lang.Object ref = deviceToken_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            deviceToken_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>optional string deviceToken = 5;</code>
       */
      public com.google.protobuf.ByteString
          getDeviceTokenBytes() {
        java.lang.Object ref = deviceToken_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          deviceToken_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>optional string deviceToken = 5;</code>
       */
      public Builder setDeviceToken(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        deviceToken_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>optional string deviceToken = 5;</code>
       */
      public Builder clearDeviceToken() {
        bitField0_ = (bitField0_ & ~0x00000010);
        deviceToken_ = getDefaultInstance().getDeviceToken();
        onChanged();
        return this;
      }
      /**
       * <code>optional string deviceToken = 5;</code>
       */
      public Builder setDeviceTokenBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000010;
        deviceToken_ = value;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:barrage.PBDevice)
    }

    static {
      defaultInstance = new PBDevice(true);
      defaultInstance.initFields();
    }

    // @@protoc_insertion_point(class_scope:barrage.PBDevice)
  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_barrage_PBDevice_descriptor;
  private static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_barrage_PBDevice_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\014Common.proto\022\007barrage\032\017Constants.proto" +
      "\"Z\n\010PBDevice\022\014\n\004type\030\001 \002(\005\022\r\n\005model\030\002 \001(" +
      "\t\022\n\n\002os\030\003 \001(\t\022\020\n\010deviceId\030\004 \001(\t\022\023\n\013devic" +
      "eToken\030\005 \001(\tB+\n\033com.orange.protocol.mess" +
      "ageB\014CommonProtos"
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
          com.orange.protocol.message.ConstantsProtos.getDescriptor(),
        }, assigner);
    internal_static_barrage_PBDevice_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_barrage_PBDevice_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_barrage_PBDevice_descriptor,
        new java.lang.String[] { "Type", "Model", "Os", "DeviceId", "DeviceToken", });
    com.orange.protocol.message.ConstantsProtos.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
