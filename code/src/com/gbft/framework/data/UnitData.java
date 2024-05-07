// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gbft.proto

package com.gbft.framework.data;

/**
 * Protobuf type {@code UnitData}
 */
public final class UnitData extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:UnitData)
    UnitDataOrBuilder {
private static final long serialVersionUID = 0L;
  // Use UnitData.newBuilder() to construct.
  private UnitData(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private UnitData() {
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new UnitData();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private UnitData(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
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
          case 8: {

            unit_ = input.readInt32();
            break;
          }
          case 16: {

            nodeCount_ = input.readInt32();
            break;
          }
          case 24: {

            clientCount_ = input.readInt32();
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return com.gbft.framework.data.Gbft.internal_static_UnitData_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.gbft.framework.data.Gbft.internal_static_UnitData_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.gbft.framework.data.UnitData.class, com.gbft.framework.data.UnitData.Builder.class);
  }

  public static final int UNIT_FIELD_NUMBER = 1;
  private int unit_;
  /**
   * <code>int32 unit = 1;</code>
   * @return The unit.
   */
  @java.lang.Override
  public int getUnit() {
    return unit_;
  }

  public static final int NODE_COUNT_FIELD_NUMBER = 2;
  private int nodeCount_;
  /**
   * <code>int32 node_count = 2;</code>
   * @return The nodeCount.
   */
  @java.lang.Override
  public int getNodeCount() {
    return nodeCount_;
  }

  public static final int CLIENT_COUNT_FIELD_NUMBER = 3;
  private int clientCount_;
  /**
   * <code>int32 client_count = 3;</code>
   * @return The clientCount.
   */
  @java.lang.Override
  public int getClientCount() {
    return clientCount_;
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
    if (unit_ != 0) {
      output.writeInt32(1, unit_);
    }
    if (nodeCount_ != 0) {
      output.writeInt32(2, nodeCount_);
    }
    if (clientCount_ != 0) {
      output.writeInt32(3, clientCount_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (unit_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(1, unit_);
    }
    if (nodeCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(2, nodeCount_);
    }
    if (clientCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream
        .computeInt32Size(3, clientCount_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof com.gbft.framework.data.UnitData)) {
      return super.equals(obj);
    }
    com.gbft.framework.data.UnitData other = (com.gbft.framework.data.UnitData) obj;

    if (getUnit()
        != other.getUnit()) return false;
    if (getNodeCount()
        != other.getNodeCount()) return false;
    if (getClientCount()
        != other.getClientCount()) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + UNIT_FIELD_NUMBER;
    hash = (53 * hash) + getUnit();
    hash = (37 * hash) + NODE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getNodeCount();
    hash = (37 * hash) + CLIENT_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getClientCount();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.gbft.framework.data.UnitData parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbft.framework.data.UnitData parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbft.framework.data.UnitData parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbft.framework.data.UnitData parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbft.framework.data.UnitData parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static com.gbft.framework.data.UnitData parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static com.gbft.framework.data.UnitData parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gbft.framework.data.UnitData parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gbft.framework.data.UnitData parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static com.gbft.framework.data.UnitData parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static com.gbft.framework.data.UnitData parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static com.gbft.framework.data.UnitData parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(com.gbft.framework.data.UnitData prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code UnitData}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:UnitData)
      com.gbft.framework.data.UnitDataOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return com.gbft.framework.data.Gbft.internal_static_UnitData_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.gbft.framework.data.Gbft.internal_static_UnitData_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.gbft.framework.data.UnitData.class, com.gbft.framework.data.UnitData.Builder.class);
    }

    // Construct using com.gbft.framework.data.UnitData.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      unit_ = 0;

      nodeCount_ = 0;

      clientCount_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return com.gbft.framework.data.Gbft.internal_static_UnitData_descriptor;
    }

    @java.lang.Override
    public com.gbft.framework.data.UnitData getDefaultInstanceForType() {
      return com.gbft.framework.data.UnitData.getDefaultInstance();
    }

    @java.lang.Override
    public com.gbft.framework.data.UnitData build() {
      com.gbft.framework.data.UnitData result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.gbft.framework.data.UnitData buildPartial() {
      com.gbft.framework.data.UnitData result = new com.gbft.framework.data.UnitData(this);
      result.unit_ = unit_;
      result.nodeCount_ = nodeCount_;
      result.clientCount_ = clientCount_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.gbft.framework.data.UnitData) {
        return mergeFrom((com.gbft.framework.data.UnitData)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.gbft.framework.data.UnitData other) {
      if (other == com.gbft.framework.data.UnitData.getDefaultInstance()) return this;
      if (other.getUnit() != 0) {
        setUnit(other.getUnit());
      }
      if (other.getNodeCount() != 0) {
        setNodeCount(other.getNodeCount());
      }
      if (other.getClientCount() != 0) {
        setClientCount(other.getClientCount());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.gbft.framework.data.UnitData parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.gbft.framework.data.UnitData) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private int unit_ ;
    /**
     * <code>int32 unit = 1;</code>
     * @return The unit.
     */
    @java.lang.Override
    public int getUnit() {
      return unit_;
    }
    /**
     * <code>int32 unit = 1;</code>
     * @param value The unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnit(int value) {
      
      unit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 unit = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnit() {
      
      unit_ = 0;
      onChanged();
      return this;
    }

    private int nodeCount_ ;
    /**
     * <code>int32 node_count = 2;</code>
     * @return The nodeCount.
     */
    @java.lang.Override
    public int getNodeCount() {
      return nodeCount_;
    }
    /**
     * <code>int32 node_count = 2;</code>
     * @param value The nodeCount to set.
     * @return This builder for chaining.
     */
    public Builder setNodeCount(int value) {
      
      nodeCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 node_count = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearNodeCount() {
      
      nodeCount_ = 0;
      onChanged();
      return this;
    }

    private int clientCount_ ;
    /**
     * <code>int32 client_count = 3;</code>
     * @return The clientCount.
     */
    @java.lang.Override
    public int getClientCount() {
      return clientCount_;
    }
    /**
     * <code>int32 client_count = 3;</code>
     * @param value The clientCount to set.
     * @return This builder for chaining.
     */
    public Builder setClientCount(int value) {
      
      clientCount_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>int32 client_count = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearClientCount() {
      
      clientCount_ = 0;
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:UnitData)
  }

  // @@protoc_insertion_point(class_scope:UnitData)
  private static final com.gbft.framework.data.UnitData DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new com.gbft.framework.data.UnitData();
  }

  public static com.gbft.framework.data.UnitData getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UnitData>
      PARSER = new com.google.protobuf.AbstractParser<UnitData>() {
    @java.lang.Override
    public UnitData parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new UnitData(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<UnitData> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UnitData> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.gbft.framework.data.UnitData getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}
