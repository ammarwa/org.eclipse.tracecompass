// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protos/perfetto/common/protolog_common.proto
// Protobuf Java Version: 4.29.3

package org.eclipse.tracecompass.internal.perfetto.protos;

public final class ProtologCommon {
  private ProtologCommon() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      ProtologCommon.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code perfetto.protos.ProtoLogLevel}
   */
  public enum ProtoLogLevel
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>PROTOLOG_LEVEL_UNDEFINED = 0;</code>
     */
    PROTOLOG_LEVEL_UNDEFINED(0),
    /**
     * <code>PROTOLOG_LEVEL_DEBUG = 1;</code>
     */
    PROTOLOG_LEVEL_DEBUG(1),
    /**
     * <code>PROTOLOG_LEVEL_VERBOSE = 2;</code>
     */
    PROTOLOG_LEVEL_VERBOSE(2),
    /**
     * <code>PROTOLOG_LEVEL_INFO = 3;</code>
     */
    PROTOLOG_LEVEL_INFO(3),
    /**
     * <code>PROTOLOG_LEVEL_WARN = 4;</code>
     */
    PROTOLOG_LEVEL_WARN(4),
    /**
     * <code>PROTOLOG_LEVEL_ERROR = 5;</code>
     */
    PROTOLOG_LEVEL_ERROR(5),
    /**
     * <code>PROTOLOG_LEVEL_WTF = 6;</code>
     */
    PROTOLOG_LEVEL_WTF(6),
    ;

    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 3,
        /* suffix= */ "",
        ProtoLogLevel.class.getName());
    }
    /**
     * <code>PROTOLOG_LEVEL_UNDEFINED = 0;</code>
     */
    public static final int PROTOLOG_LEVEL_UNDEFINED_VALUE = 0;
    /**
     * <code>PROTOLOG_LEVEL_DEBUG = 1;</code>
     */
    public static final int PROTOLOG_LEVEL_DEBUG_VALUE = 1;
    /**
     * <code>PROTOLOG_LEVEL_VERBOSE = 2;</code>
     */
    public static final int PROTOLOG_LEVEL_VERBOSE_VALUE = 2;
    /**
     * <code>PROTOLOG_LEVEL_INFO = 3;</code>
     */
    public static final int PROTOLOG_LEVEL_INFO_VALUE = 3;
    /**
     * <code>PROTOLOG_LEVEL_WARN = 4;</code>
     */
    public static final int PROTOLOG_LEVEL_WARN_VALUE = 4;
    /**
     * <code>PROTOLOG_LEVEL_ERROR = 5;</code>
     */
    public static final int PROTOLOG_LEVEL_ERROR_VALUE = 5;
    /**
     * <code>PROTOLOG_LEVEL_WTF = 6;</code>
     */
    public static final int PROTOLOG_LEVEL_WTF_VALUE = 6;


    public final int getNumber() {
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ProtoLogLevel valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ProtoLogLevel forNumber(int value) {
      switch (value) {
        case 0: return PROTOLOG_LEVEL_UNDEFINED;
        case 1: return PROTOLOG_LEVEL_DEBUG;
        case 2: return PROTOLOG_LEVEL_VERBOSE;
        case 3: return PROTOLOG_LEVEL_INFO;
        case 4: return PROTOLOG_LEVEL_WARN;
        case 5: return PROTOLOG_LEVEL_ERROR;
        case 6: return PROTOLOG_LEVEL_WTF;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ProtoLogLevel>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        ProtoLogLevel> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<ProtoLogLevel>() {
            public ProtoLogLevel findValueByNumber(int number) {
              return ProtoLogLevel.forNumber(number);
            }
          };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor
        getValueDescriptor() {
      return getDescriptor().getValues().get(ordinal());
    }
    public final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptorForType() {
      return getDescriptor();
    }
    public static final com.google.protobuf.Descriptors.EnumDescriptor
        getDescriptor() {
      return org.eclipse.tracecompass.internal.perfetto.protos.ProtologCommon.getDescriptor().getEnumTypes().get(0);
    }

    private static final ProtoLogLevel[] VALUES = values();

    public static ProtoLogLevel valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ProtoLogLevel(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:perfetto.protos.ProtoLogLevel)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,protos/perfetto/common/protolog_common" +
      ".proto\022\017perfetto.protos*\307\001\n\rProtoLogLeve" +
      "l\022\034\n\030PROTOLOG_LEVEL_UNDEFINED\020\000\022\030\n\024PROTO" +
      "LOG_LEVEL_DEBUG\020\001\022\032\n\026PROTOLOG_LEVEL_VERB" +
      "OSE\020\002\022\027\n\023PROTOLOG_LEVEL_INFO\020\003\022\027\n\023PROTOL" +
      "OG_LEVEL_WARN\020\004\022\030\n\024PROTOLOG_LEVEL_ERROR\020" +
      "\005\022\026\n\022PROTOLOG_LEVEL_WTF\020\006"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
