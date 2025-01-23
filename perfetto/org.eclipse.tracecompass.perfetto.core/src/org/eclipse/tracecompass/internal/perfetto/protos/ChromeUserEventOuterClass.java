// Generated by the protocol buffer compiler.  DO NOT EDIT!
// NO CHECKED-IN PROTOBUF GENCODE
// source: protos/perfetto/trace/track_event/chrome_user_event.proto
// Protobuf Java Version: 4.29.3

package org.eclipse.tracecompass.internal.perfetto.protos;

public final class ChromeUserEventOuterClass {
  private ChromeUserEventOuterClass() {}
  static {
    com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
      com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
      /* major= */ 4,
      /* minor= */ 29,
      /* patch= */ 3,
      /* suffix= */ "",
      ChromeUserEventOuterClass.class.getName());
  }
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ChromeUserEventOrBuilder extends
      // @@protoc_insertion_point(interface_extends:perfetto.protos.ChromeUserEvent)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     * Name of the action, e.g. "NewTab", "ShowBookmarkManager", etc. (in
     * Chrome, these are usually static strings known at compile time, or
     * concatenations of multiple such static strings).
     * </pre>
     *
     * <code>optional string action = 1;</code>
     * @return Whether the action field is set.
     */
    boolean hasAction();
    /**
     * <pre>
     * Name of the action, e.g. "NewTab", "ShowBookmarkManager", etc. (in
     * Chrome, these are usually static strings known at compile time, or
     * concatenations of multiple such static strings).
     * </pre>
     *
     * <code>optional string action = 1;</code>
     * @return The action.
     */
    java.lang.String getAction();
    /**
     * <pre>
     * Name of the action, e.g. "NewTab", "ShowBookmarkManager", etc. (in
     * Chrome, these are usually static strings known at compile time, or
     * concatenations of multiple such static strings).
     * </pre>
     *
     * <code>optional string action = 1;</code>
     * @return The bytes for action.
     */
    com.google.protobuf.ByteString
        getActionBytes();

    /**
     * <pre>
     * MD5 hash of the action string.
     * </pre>
     *
     * <code>optional uint64 action_hash = 2;</code>
     * @return Whether the actionHash field is set.
     */
    boolean hasActionHash();
    /**
     * <pre>
     * MD5 hash of the action string.
     * </pre>
     *
     * <code>optional uint64 action_hash = 2;</code>
     * @return The actionHash.
     */
    long getActionHash();
  }
  /**
   * <pre>
   * Details about a UI interaction initiated by the user, such as opening or
   * closing a tab or a context menu.
   * </pre>
   *
   * Protobuf type {@code perfetto.protos.ChromeUserEvent}
   */
  public static final class ChromeUserEvent extends
      com.google.protobuf.GeneratedMessage implements
      // @@protoc_insertion_point(message_implements:perfetto.protos.ChromeUserEvent)
      ChromeUserEventOrBuilder {
  private static final long serialVersionUID = 0L;
    static {
      com.google.protobuf.RuntimeVersion.validateProtobufGencodeVersion(
        com.google.protobuf.RuntimeVersion.RuntimeDomain.PUBLIC,
        /* major= */ 4,
        /* minor= */ 29,
        /* patch= */ 3,
        /* suffix= */ "",
        ChromeUserEvent.class.getName());
    }
    // Use ChromeUserEvent.newBuilder() to construct.
    private ChromeUserEvent(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
      super(builder);
    }
    private ChromeUserEvent() {
      action_ = "";
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.internal_static_perfetto_protos_ChromeUserEvent_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.internal_static_perfetto_protos_ChromeUserEvent_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent.class, org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent.Builder.class);
    }

    private int bitField0_;
    public static final int ACTION_FIELD_NUMBER = 1;
    @SuppressWarnings("serial")
    private volatile java.lang.Object action_ = "";
    /**
     * <pre>
     * Name of the action, e.g. "NewTab", "ShowBookmarkManager", etc. (in
     * Chrome, these are usually static strings known at compile time, or
     * concatenations of multiple such static strings).
     * </pre>
     *
     * <code>optional string action = 1;</code>
     * @return Whether the action field is set.
     */
    @java.lang.Override
    public boolean hasAction() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <pre>
     * Name of the action, e.g. "NewTab", "ShowBookmarkManager", etc. (in
     * Chrome, these are usually static strings known at compile time, or
     * concatenations of multiple such static strings).
     * </pre>
     *
     * <code>optional string action = 1;</code>
     * @return The action.
     */
    @java.lang.Override
    public java.lang.String getAction() {
      java.lang.Object ref = action_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          action_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     * Name of the action, e.g. "NewTab", "ShowBookmarkManager", etc. (in
     * Chrome, these are usually static strings known at compile time, or
     * concatenations of multiple such static strings).
     * </pre>
     *
     * <code>optional string action = 1;</code>
     * @return The bytes for action.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getActionBytes() {
      java.lang.Object ref = action_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        action_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int ACTION_HASH_FIELD_NUMBER = 2;
    private long actionHash_ = 0L;
    /**
     * <pre>
     * MD5 hash of the action string.
     * </pre>
     *
     * <code>optional uint64 action_hash = 2;</code>
     * @return Whether the actionHash field is set.
     */
    @java.lang.Override
    public boolean hasActionHash() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <pre>
     * MD5 hash of the action string.
     * </pre>
     *
     * <code>optional uint64 action_hash = 2;</code>
     * @return The actionHash.
     */
    @java.lang.Override
    public long getActionHash() {
      return actionHash_;
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
        com.google.protobuf.GeneratedMessage.writeString(output, 1, action_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        output.writeUInt64(2, actionHash_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.GeneratedMessage.computeStringSize(1, action_);
      }
      if (((bitField0_ & 0x00000002) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, actionHash_);
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
      if (!(obj instanceof org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent)) {
        return super.equals(obj);
      }
      org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent other = (org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent) obj;

      if (hasAction() != other.hasAction()) return false;
      if (hasAction()) {
        if (!getAction()
            .equals(other.getAction())) return false;
      }
      if (hasActionHash() != other.hasActionHash()) return false;
      if (hasActionHash()) {
        if (getActionHash()
            != other.getActionHash()) return false;
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
      if (hasAction()) {
        hash = (37 * hash) + ACTION_FIELD_NUMBER;
        hash = (53 * hash) + getAction().hashCode();
      }
      if (hasActionHash()) {
        hash = (37 * hash) + ACTION_HASH_FIELD_NUMBER;
        hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
            getActionHash());
      }
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessage
          .parseWithIOException(PARSER, input);
    }
    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent parseFrom(
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
    public static Builder newBuilder(org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent prototype) {
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
     * Details about a UI interaction initiated by the user, such as opening or
     * closing a tab or a context menu.
     * </pre>
     *
     * Protobuf type {@code perfetto.protos.ChromeUserEvent}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessage.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:perfetto.protos.ChromeUserEvent)
        org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEventOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.internal_static_perfetto_protos_ChromeUserEvent_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.internal_static_perfetto_protos_ChromeUserEvent_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent.class, org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent.Builder.class);
      }

      // Construct using perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent.newBuilder()
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
        action_ = "";
        actionHash_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.internal_static_perfetto_protos_ChromeUserEvent_descriptor;
      }

      @java.lang.Override
      public org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent getDefaultInstanceForType() {
        return org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent.getDefaultInstance();
      }

      @java.lang.Override
      public org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent build() {
        org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent buildPartial() {
        org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent result = new org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.action_ = action_;
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.actionHash_ = actionHash_;
          to_bitField0_ |= 0x00000002;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent) {
          return mergeFrom((org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent other) {
        if (other == org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent.getDefaultInstance()) return this;
        if (other.hasAction()) {
          action_ = other.action_;
          bitField0_ |= 0x00000001;
          onChanged();
        }
        if (other.hasActionHash()) {
          setActionHash(other.getActionHash());
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
              case 10: {
                action_ = input.readBytes();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                actionHash_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

      private java.lang.Object action_ = "";
      /**
       * <pre>
       * Name of the action, e.g. "NewTab", "ShowBookmarkManager", etc. (in
       * Chrome, these are usually static strings known at compile time, or
       * concatenations of multiple such static strings).
       * </pre>
       *
       * <code>optional string action = 1;</code>
       * @return Whether the action field is set.
       */
      public boolean hasAction() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <pre>
       * Name of the action, e.g. "NewTab", "ShowBookmarkManager", etc. (in
       * Chrome, these are usually static strings known at compile time, or
       * concatenations of multiple such static strings).
       * </pre>
       *
       * <code>optional string action = 1;</code>
       * @return The action.
       */
      public java.lang.String getAction() {
        java.lang.Object ref = action_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            action_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       * Name of the action, e.g. "NewTab", "ShowBookmarkManager", etc. (in
       * Chrome, these are usually static strings known at compile time, or
       * concatenations of multiple such static strings).
       * </pre>
       *
       * <code>optional string action = 1;</code>
       * @return The bytes for action.
       */
      public com.google.protobuf.ByteString
          getActionBytes() {
        java.lang.Object ref = action_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          action_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       * Name of the action, e.g. "NewTab", "ShowBookmarkManager", etc. (in
       * Chrome, these are usually static strings known at compile time, or
       * concatenations of multiple such static strings).
       * </pre>
       *
       * <code>optional string action = 1;</code>
       * @param value The action to set.
       * @return This builder for chaining.
       */
      public Builder setAction(
          java.lang.String value) {
        if (value == null) { throw new NullPointerException(); }
        action_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Name of the action, e.g. "NewTab", "ShowBookmarkManager", etc. (in
       * Chrome, these are usually static strings known at compile time, or
       * concatenations of multiple such static strings).
       * </pre>
       *
       * <code>optional string action = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearAction() {
        action_ = getDefaultInstance().getAction();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
        return this;
      }
      /**
       * <pre>
       * Name of the action, e.g. "NewTab", "ShowBookmarkManager", etc. (in
       * Chrome, these are usually static strings known at compile time, or
       * concatenations of multiple such static strings).
       * </pre>
       *
       * <code>optional string action = 1;</code>
       * @param value The bytes for action to set.
       * @return This builder for chaining.
       */
      public Builder setActionBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) { throw new NullPointerException(); }
        action_ = value;
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }

      private long actionHash_ ;
      /**
       * <pre>
       * MD5 hash of the action string.
       * </pre>
       *
       * <code>optional uint64 action_hash = 2;</code>
       * @return Whether the actionHash field is set.
       */
      @java.lang.Override
      public boolean hasActionHash() {
        return ((bitField0_ & 0x00000002) != 0);
      }
      /**
       * <pre>
       * MD5 hash of the action string.
       * </pre>
       *
       * <code>optional uint64 action_hash = 2;</code>
       * @return The actionHash.
       */
      @java.lang.Override
      public long getActionHash() {
        return actionHash_;
      }
      /**
       * <pre>
       * MD5 hash of the action string.
       * </pre>
       *
       * <code>optional uint64 action_hash = 2;</code>
       * @param value The actionHash to set.
       * @return This builder for chaining.
       */
      public Builder setActionHash(long value) {

        actionHash_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <pre>
       * MD5 hash of the action string.
       * </pre>
       *
       * <code>optional uint64 action_hash = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearActionHash() {
        bitField0_ = (bitField0_ & ~0x00000002);
        actionHash_ = 0L;
        onChanged();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:perfetto.protos.ChromeUserEvent)
    }

    // @@protoc_insertion_point(class_scope:perfetto.protos.ChromeUserEvent)
    private static final org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent();
    }

    public static org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ChromeUserEvent>
        PARSER = new com.google.protobuf.AbstractParser<ChromeUserEvent>() {
      @java.lang.Override
      public ChromeUserEvent parsePartialFrom(
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

    public static com.google.protobuf.Parser<ChromeUserEvent> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ChromeUserEvent> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public org.eclipse.tracecompass.internal.perfetto.protos.ChromeUserEventOuterClass.ChromeUserEvent getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_perfetto_protos_ChromeUserEvent_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_perfetto_protos_ChromeUserEvent_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n9protos/perfetto/trace/track_event/chro" +
      "me_user_event.proto\022\017perfetto.protos\"6\n\017" +
      "ChromeUserEvent\022\016\n\006action\030\001 \001(\t\022\023\n\013actio" +
      "n_hash\030\002 \001(\004"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_perfetto_protos_ChromeUserEvent_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_perfetto_protos_ChromeUserEvent_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_perfetto_protos_ChromeUserEvent_descriptor,
        new java.lang.String[] { "Action", "ActionHash", });
    descriptor.resolveAllFeaturesImmutable();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
