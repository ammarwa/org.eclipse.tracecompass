// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protos/perfetto/trace/track_event/chrome_content_settings_event_info.proto
// Protobuf Java Version: 4.29.3

package org.eclipse.tracecompass.internal.perfetto.protos;

public final class ChromeContentSettingsEventInfoOuterClass {
  private ChromeContentSettingsEventInfoOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      ChromeContentSettingsEventInfoOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChromeContentSettingsEventInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:perfetto.protos.ChromeContentSettingsEventInfo)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * The number of user defined hostname patterns for content settings at
     * browser start. Similar to UMA histogram
     * 'ContentSettings.NumberOfExceptions'.
     * </pre>
     *
     * <code>optional uint32 number_of_exceptions = 1;</code>
     * @return Whether the numberOfExceptions field is set.
     */
    boolean hasNumberOfExceptions();
    /**
     * <pre>
     * The number of user defined hostname patterns for content settings at
     * browser start. Similar to UMA histogram
     * 'ContentSettings.NumberOfExceptions'.
     * </pre>
     *
     * <code>optional uint32 number_of_exceptions = 1;</code>
     * @return The numberOfExceptions.
     */
    int getNumberOfExceptions();
  }
  /**
   * <pre>
   * Details about ContentSettings trace events.
   * </pre>
   *
   * Protobuf type {@code perfetto.protos.ChromeContentSettingsEventInfo}
   */
  public static final class ChromeContentSettingsEventInfo extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:perfetto.protos.ChromeContentSettingsEventInfo)
      ChromeContentSettingsEventInfoOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 3,
        /* suffix= */ "",
        ChromeContentSettingsEventInfo.class.getName());
    }
    // Use ChromeContentSettingsEventInfo.newBuilder() to construct.
    private ChromeContentSettingsEventInfo(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ChromeContentSettingsEventInfo() {
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.internal_static_perfetto_protos_ChromeContentSettingsEventInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.internal_static_perfetto_protos_ChromeContentSettingsEventInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo.class, org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo.Builder.class);
    }

    private int bitField0_;
    public static final int NUMBER_OF_EXCEPTIONS_FIELD_NUMBER = 1;
    private int numberOfExceptions_ = 0;
    /**
     * <pre>
     * The number of user defined hostname patterns for content settings at
     * browser start. Similar to UMA histogram
     * 'ContentSettings.NumberOfExceptions'.
     * </pre>
     *
     * <code>optional uint32 number_of_exceptions = 1;</code>
     * @return Whether the numberOfExceptions field is set.
     */
    @java.lang.Override
    public boolean hasNumberOfExceptions() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * The number of user defined hostname patterns for content settings at
     * browser start. Similar to UMA histogram
     * 'ContentSettings.NumberOfExceptions'.
     * </pre>
     *
     * <code>optional uint32 number_of_exceptions = 1;</code>
     * @return The numberOfExceptions.
     */
    @java.lang.Override
    public int getNumberOfExceptions() {
      return numberOfExceptions_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeUInt32(1, numberOfExceptions_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(1, numberOfExceptions_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo)) {
        return super.equals(obj);
      }
      org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo other = (org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo) obj;

      if (hasNumberOfExceptions() != other.hasNumberOfExceptions()) return false;
      if (hasNumberOfExceptions()) {
        if (getNumberOfExceptions()
            != other.getNumberOfExceptions()) return false;
      }
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasNumberOfExceptions()) {
        hash = (37 * hash) + NUMBER_OF_EXCEPTIONS_FIELD_NUMBER;
        hash = (53 * hash) + getNumberOfExceptions();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * <pre>
     * Details about ContentSettings trace events.
     * </pre>
     *
     * Protobuf type {@code perfetto.protos.ChromeContentSettingsEventInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:perfetto.protos.ChromeContentSettingsEventInfo)
        org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfoOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.internal_static_perfetto_protos_ChromeContentSettingsEventInfo_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.internal_static_perfetto_protos_ChromeContentSettingsEventInfo_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo.class, org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo.Builder.class);
      }

      // Construct using perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo.newBuilder()
      private Builder() {

      }

      private Builder(
          com.google.protobuf.GeneratedMessage.BuilderParent parent) {
        super(parent);

      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        numberOfExceptions_ = 0;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.internal_static_perfetto_protos_ChromeContentSettingsEventInfo_descriptor;
      }

      @java.lang.Override
      public org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo getDefaultInstanceForType() {
        return org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo.getDefaultInstance();
      }

      @java.lang.Override
      public org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo build() {
        org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo buildPartial() {
        org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo result = new org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.numberOfExceptions_ = numberOfExceptions_;
          to_bitField0_ |= 0x00000001;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo) {
          return mergeFrom((org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo other) {
        if (other == org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo.getDefaultInstance()) return this;
        if (other.hasNumberOfExceptions()) {
          setNumberOfExceptions(other.getNumberOfExceptions());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 8: {
                numberOfExceptions_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private int numberOfExceptions_ ;
      /**
       * <pre>
       * The number of user defined hostname patterns for content settings at
       * browser start. Similar to UMA histogram
       * 'ContentSettings.NumberOfExceptions'.
       * </pre>
       *
       * <code>optional uint32 number_of_exceptions = 1;</code>
       * @return Whether the numberOfExceptions field is set.
       */
      @java.lang.Override
      public boolean hasNumberOfExceptions() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * The number of user defined hostname patterns for content settings at
       * browser start. Similar to UMA histogram
       * 'ContentSettings.NumberOfExceptions'.
       * </pre>
       *
       * <code>optional uint32 number_of_exceptions = 1;</code>
       * @return The numberOfExceptions.
       */
      @java.lang.Override
      public int getNumberOfExceptions() {
        return numberOfExceptions_;
      }
      /**
       * <pre>
       * The number of user defined hostname patterns for content settings at
       * browser start. Similar to UMA histogram
       * 'ContentSettings.NumberOfExceptions'.
       * </pre>
       *
       * <code>optional uint32 number_of_exceptions = 1;</code>
       * @param value The numberOfExceptions to set.
       * @return This builder for chaining.
       */
      public Builder setNumberOfExceptions(int value) {

        numberOfExceptions_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * The number of user defined hostname patterns for content settings at
       * browser start. Similar to UMA histogram
       * 'ContentSettings.NumberOfExceptions'.
       * </pre>
       *
       * <code>optional uint32 number_of_exceptions = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearNumberOfExceptions() {
        bitField0_ = (bitField0_ & ~0x00000001);
        numberOfExceptions_ = 0;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:perfetto.protos.ChromeContentSettingsEventInfo)
    }

    // @@protoc_insertion_point(class_scope:perfetto.protos.ChromeContentSettingsEventInfo)
    private static final org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo();
    }

    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChromeContentSettingsEventInfo>
        PARSER = new com.google.protobuf.AbstractParser<ChromeContentSettingsEventInfo>() {
      @java.lang.Override
      public ChromeContentSettingsEventInfo parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<ChromeContentSettingsEventInfo> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChromeContentSettingsEventInfo> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.eclipse.tracecompass.internal.perfetto.protos.ChromeContentSettingsEventInfoOuterClass.ChromeContentSettingsEventInfo getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_perfetto_protos_ChromeContentSettingsEventInfo_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_perfetto_protos_ChromeContentSettingsEventInfo_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\nJprotos/perfetto/trace/track_event/chro" +
      "me_content_settings_event_info.proto\022\017pe" +
      "rfetto.protos\">\n\036ChromeContentSettingsEv" +
      "entInfo\022\034\n\024number_of_exceptions\030\001 \001(\r"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_perfetto_protos_ChromeContentSettingsEventInfo_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_perfetto_protos_ChromeContentSettingsEventInfo_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_perfetto_protos_ChromeContentSettingsEventInfo_descriptor,
        new java.lang.String[] { "NumberOfExceptions", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
