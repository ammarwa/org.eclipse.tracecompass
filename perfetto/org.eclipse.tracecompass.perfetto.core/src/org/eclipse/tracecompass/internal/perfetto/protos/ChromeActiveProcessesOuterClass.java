// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protos/perfetto/trace/track_event/chrome_active_processes.proto
// Protobuf Java Version: 4.29.3

package org.eclipse.tracecompass.internal.perfetto.protos;

public final class ChromeActiveProcessesOuterClass {
  private ChromeActiveProcessesOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      ChromeActiveProcessesOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChromeActiveProcessesOrBuilder extends
      // @@protoc_insertion_point(interface_extends:perfetto.protos.ChromeActiveProcesses)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated int32 pid = 1;</code>
     * @return A list containing the pid.
     */
    java.util.List<java.lang.Integer> getPidList();
    /**
     * <code>repeated int32 pid = 1;</code>
     * @return The count of pid.
     */
    int getPidCount();
    /**
     * <code>repeated int32 pid = 1;</code>
     * @param index The index of the element to return.
     * @return The pid at the given index.
     */
    int getPid(int index);
  }
  /**
   * <pre>
   * A list of processes connected to the tracing service.
   * </pre>
   *
   * Protobuf type {@code perfetto.protos.ChromeActiveProcesses}
   */
  public static final class ChromeActiveProcesses extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:perfetto.protos.ChromeActiveProcesses)
      ChromeActiveProcessesOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 3,
        /* suffix= */ "",
        ChromeActiveProcesses.class.getName());
    }
    // Use ChromeActiveProcesses.newBuilder() to construct.
    private ChromeActiveProcesses(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ChromeActiveProcesses() {
      pid_ = emptyIntList();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.internal_static_perfetto_protos_ChromeActiveProcesses_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.internal_static_perfetto_protos_ChromeActiveProcesses_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses.class, org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses.Builder.class);
    }

    public static final int PID_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private com.google.protobuf.Internal.IntList pid_ =
        emptyIntList();
    /**
     * <code>repeated int32 pid = 1;</code>
     * @return A list containing the pid.
     */
    @java.lang.Override
    public java.util.List<java.lang.Integer>
        getPidList() {
      return pid_;
    }
    /**
     * <code>repeated int32 pid = 1;</code>
     * @return The count of pid.
     */
    public int getPidCount() {
      return pid_.size();
    }
    /**
     * <code>repeated int32 pid = 1;</code>
     * @param index The index of the element to return.
     * @return The pid at the given index.
     */
    public int getPid(int index) {
      return pid_.getInt(index);
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
      for (int i = 0; i < pid_.size(); i++) {
        output.writeInt32(1, pid_.getInt(i));
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      {
        int dataSize = 0;
        for (int i = 0; i < pid_.size(); i++) {
          dataSize += com.google.protobuf.CodedOutputStream
            .computeInt32SizeNoTag(pid_.getInt(i));
        }
        size += dataSize;
        size += 1 * getPidList().size();
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
      if (!(obj instanceof org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses)) {
        return super.equals(obj);
      }
      org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses other = (org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses) obj;

      if (!getPidList()
          .equals(other.getPidList())) return false;
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
      if (getPidCount() > 0) {
        hash = (37 * hash) + PID_FIELD_NUMBER;
        hash = (53 * hash) + getPidList().hashCode();
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses parseFrom(
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
    public static Builder newBuilder(org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses prototype) {
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
     * A list of processes connected to the tracing service.
     * </pre>
     *
     * Protobuf type {@code perfetto.protos.ChromeActiveProcesses}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:perfetto.protos.ChromeActiveProcesses)
        org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcessesOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.internal_static_perfetto_protos_ChromeActiveProcesses_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.internal_static_perfetto_protos_ChromeActiveProcesses_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses.class, org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses.Builder.class);
      }

      // Construct using perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses.newBuilder()
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
        pid_ = emptyIntList();
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.internal_static_perfetto_protos_ChromeActiveProcesses_descriptor;
      }

      @java.lang.Override
      public org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses getDefaultInstanceForType() {
        return org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses.getDefaultInstance();
      }

      @java.lang.Override
      public org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses build() {
        org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses buildPartial() {
        org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses result = new org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses result) {
        int from_bitField0_ = bitField0_;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          pid_.makeImmutable();
          result.pid_ = pid_;
        }
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses) {
          return mergeFrom((org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses other) {
        if (other == org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses.getDefaultInstance()) return this;
        if (!other.pid_.isEmpty()) {
          if (pid_.isEmpty()) {
            pid_ = other.pid_;
            pid_.makeImmutable();
            bitField0_ |= 0x00000001;
          } else {
            ensurePidIsMutable();
            pid_.addAll(other.pid_);
          }
          onChanged();
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
                int v = input.readInt32();
                ensurePidIsMutable();
                pid_.addInt(v);
                break;
              } // case 8
              case 10: {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensurePidIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  pid_.addInt(input.readInt32());
                }
                input.popLimit(limit);
                break;
              } // case 10
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

      private com.google.protobuf.Internal.IntList pid_ = emptyIntList();
      private void ensurePidIsMutable() {
        if (!pid_.isModifiable()) {
          pid_ = makeMutableCopy(pid_);
        }
        bitField0_ |= 0x00000001;
      }
      /**
       * <code>repeated int32 pid = 1;</code>
       * @return A list containing the pid.
       */
      public java.util.List<java.lang.Integer>
          getPidList() {
        pid_.makeImmutable();
        return pid_;
      }
      /**
       * <code>repeated int32 pid = 1;</code>
       * @return The count of pid.
       */
      public int getPidCount() {
        return pid_.size();
      }
      /**
       * <code>repeated int32 pid = 1;</code>
       * @param index The index of the element to return.
       * @return The pid at the given index.
       */
      public int getPid(int index) {
        return pid_.getInt(index);
      }
      /**
       * <code>repeated int32 pid = 1;</code>
       * @param index The index to set the value at.
       * @param value The pid to set.
       * @return This builder for chaining.
       */
      public Builder setPid(
          int index, int value) {

        ensurePidIsMutable();
        pid_.setInt(index, value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 pid = 1;</code>
       * @param value The pid to add.
       * @return This builder for chaining.
       */
      public Builder addPid(int value) {

        ensurePidIsMutable();
        pid_.addInt(value);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 pid = 1;</code>
       * @param values The pid to add.
       * @return This builder for chaining.
       */
      public Builder addAllPid(
          java.lang.Iterable<? extends java.lang.Integer> values) {
        ensurePidIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, pid_);
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>repeated int32 pid = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPid() {
        pid_ = emptyIntList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:perfetto.protos.ChromeActiveProcesses)
    }

    // @@protoc_insertion_point(class_scope:perfetto.protos.ChromeActiveProcesses)
    private static final org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses();
    }

    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChromeActiveProcesses>
        PARSER = new com.google.protobuf.AbstractParser<ChromeActiveProcesses>() {
      @java.lang.Override
      public ChromeActiveProcesses parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChromeActiveProcesses> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChromeActiveProcesses> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.eclipse.tracecompass.internal.perfetto.protos.ChromeActiveProcessesOuterClass.ChromeActiveProcesses getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_perfetto_protos_ChromeActiveProcesses_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_perfetto_protos_ChromeActiveProcesses_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n?protos/perfetto/trace/track_event/chro" +
      "me_active_processes.proto\022\017perfetto.prot" +
      "os\"$\n\025ChromeActiveProcesses\022\013\n\003pid\030\001 \003(\005"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_perfetto_protos_ChromeActiveProcesses_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_perfetto_protos_ChromeActiveProcesses_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_perfetto_protos_ChromeActiveProcesses_descriptor,
        new java.lang.String[] { "Pid", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
