// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Constants.proto

package com.orange.protocol.message;

public final class ConstantsProtos {
  private ConstantsProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  /**
   * Protobuf enum {@code barrage.PBDeviceType}
   */
  public enum PBDeviceType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>DEVICE_TYPE_IPHONE = 1;</code>
     */
    DEVICE_TYPE_IPHONE(0, 1),
    /**
     * <code>DEVICE_TYPE_ANDROID = 2;</code>
     */
    DEVICE_TYPE_ANDROID(1, 2),
    /**
     * <code>DEVICE_TYPE_WINDOW = 3;</code>
     */
    DEVICE_TYPE_WINDOW(2, 3),
    ;

    /**
     * <code>DEVICE_TYPE_IPHONE = 1;</code>
     */
    public static final int DEVICE_TYPE_IPHONE_VALUE = 1;
    /**
     * <code>DEVICE_TYPE_ANDROID = 2;</code>
     */
    public static final int DEVICE_TYPE_ANDROID_VALUE = 2;
    /**
     * <code>DEVICE_TYPE_WINDOW = 3;</code>
     */
    public static final int DEVICE_TYPE_WINDOW_VALUE = 3;


    public final int getNumber() { return value; }

    public static PBDeviceType valueOf(int value) {
      switch (value) {
        case 1: return DEVICE_TYPE_IPHONE;
        case 2: return DEVICE_TYPE_ANDROID;
        case 3: return DEVICE_TYPE_WINDOW;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PBDeviceType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<PBDeviceType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PBDeviceType>() {
            public PBDeviceType findValueByNumber(int number) {
              return PBDeviceType.valueOf(number);
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
      return com.orange.protocol.message.ConstantsProtos.getDescriptor().getEnumTypes().get(0);
    }

    private static final PBDeviceType[] VALUES = values();

    public static PBDeviceType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private PBDeviceType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:barrage.PBDeviceType)
  }

  /**
   * Protobuf enum {@code barrage.PBFeedType}
   */
  public enum PBFeedType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>FEED_IMAGE_TEXT = 0;</code>
     *
     * <pre>
     * 图文
     * </pre>
     */
    FEED_IMAGE_TEXT(0, 0),
    ;

    /**
     * <code>FEED_IMAGE_TEXT = 0;</code>
     *
     * <pre>
     * 图文
     * </pre>
     */
    public static final int FEED_IMAGE_TEXT_VALUE = 0;


    public final int getNumber() { return value; }

    public static PBFeedType valueOf(int value) {
      switch (value) {
        case 0: return FEED_IMAGE_TEXT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PBFeedType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<PBFeedType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PBFeedType>() {
            public PBFeedType findValueByNumber(int number) {
              return PBFeedType.valueOf(number);
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
      return com.orange.protocol.message.ConstantsProtos.getDescriptor().getEnumTypes().get(1);
    }

    private static final PBFeedType[] VALUES = values();

    public static PBFeedType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private PBFeedType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:barrage.PBFeedType)
  }

  /**
   * Protobuf enum {@code barrage.PBFeedActionType}
   */
  public enum PBFeedActionType
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>ACTION_BARRAGE_TEXT = 0;</code>
     *
     * <pre>
     * 文字弹幕
     * </pre>
     */
    ACTION_BARRAGE_TEXT(0, 0),
    ;

    /**
     * <code>ACTION_BARRAGE_TEXT = 0;</code>
     *
     * <pre>
     * 文字弹幕
     * </pre>
     */
    public static final int ACTION_BARRAGE_TEXT_VALUE = 0;


    public final int getNumber() { return value; }

    public static PBFeedActionType valueOf(int value) {
      switch (value) {
        case 0: return ACTION_BARRAGE_TEXT;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PBFeedActionType>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<PBFeedActionType>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PBFeedActionType>() {
            public PBFeedActionType findValueByNumber(int number) {
              return PBFeedActionType.valueOf(number);
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
      return com.orange.protocol.message.ConstantsProtos.getDescriptor().getEnumTypes().get(2);
    }

    private static final PBFeedActionType[] VALUES = values();

    public static PBFeedActionType valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private PBFeedActionType(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:barrage.PBFeedActionType)
  }

  /**
   * Protobuf enum {@code barrage.PBColorMode}
   */
  public enum PBColorMode
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>BLACK_WHITE = 0;</code>
     *
     * <pre>
     * 黑色字体白色阴影
     * </pre>
     */
    BLACK_WHITE(0, 0),
    /**
     * <code>WHITE_BLACK = 1;</code>
     *
     * <pre>
     * 白色字体黑色阴影
     * </pre>
     */
    WHITE_BLACK(1, 1),
    ;

    /**
     * <code>BLACK_WHITE = 0;</code>
     *
     * <pre>
     * 黑色字体白色阴影
     * </pre>
     */
    public static final int BLACK_WHITE_VALUE = 0;
    /**
     * <code>WHITE_BLACK = 1;</code>
     *
     * <pre>
     * 白色字体黑色阴影
     * </pre>
     */
    public static final int WHITE_BLACK_VALUE = 1;


    public final int getNumber() { return value; }

    public static PBColorMode valueOf(int value) {
      switch (value) {
        case 0: return BLACK_WHITE;
        case 1: return WHITE_BLACK;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PBColorMode>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static com.google.protobuf.Internal.EnumLiteMap<PBColorMode>
        internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<PBColorMode>() {
            public PBColorMode findValueByNumber(int number) {
              return PBColorMode.valueOf(number);
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
      return com.orange.protocol.message.ConstantsProtos.getDescriptor().getEnumTypes().get(3);
    }

    private static final PBColorMode[] VALUES = values();

    public static PBColorMode valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int index;
    private final int value;

    private PBColorMode(int index, int value) {
      this.index = index;
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:barrage.PBColorMode)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\017Constants.proto\022\007barrage*W\n\014PBDeviceTy" +
      "pe\022\026\n\022DEVICE_TYPE_IPHONE\020\001\022\027\n\023DEVICE_TYP" +
      "E_ANDROID\020\002\022\026\n\022DEVICE_TYPE_WINDOW\020\003*!\n\nP" +
      "BFeedType\022\023\n\017FEED_IMAGE_TEXT\020\000*+\n\020PBFeed" +
      "ActionType\022\027\n\023ACTION_BARRAGE_TEXT\020\000*/\n\013P" +
      "BColorMode\022\017\n\013BLACK_WHITE\020\000\022\017\n\013WHITE_BLA" +
      "CK\020\001B.\n\033com.orange.protocol.messageB\017Con" +
      "stantsProtos"
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
