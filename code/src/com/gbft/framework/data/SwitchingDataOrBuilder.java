// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: gbft.proto

package com.gbft.framework.data;

public interface SwitchingDataOrBuilder extends
    // @@protoc_insertion_point(interface_extends:SwitchingData)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>bool switch_ready = 1;</code>
   * @return The switchReady.
   */
  boolean getSwitchReady();

  /**
   * <code>string next_protocol = 2;</code>
   * @return The nextProtocol.
   */
  java.lang.String getNextProtocol();
  /**
   * <code>string next_protocol = 2;</code>
   * @return The bytes for nextProtocol.
   */
  com.google.protobuf.ByteString
      getNextProtocolBytes();
}