// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package com.learning.models;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * name field
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  java.lang.String getName();
  /**
   * <pre>
   * name field
   * </pre>
   *
   * <code>string name = 1;</code>
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <pre>
   *age field
   * </pre>
   *
   * <code>.google.protobuf.Int32Value age = 2;</code>
   */
  boolean hasAge();
  /**
   * <pre>
   *age field
   * </pre>
   *
   * <code>.google.protobuf.Int32Value age = 2;</code>
   */
  com.google.protobuf.Int32Value getAge();
  /**
   * <pre>
   *age field
   * </pre>
   *
   * <code>.google.protobuf.Int32Value age = 2;</code>
   */
  com.google.protobuf.Int32ValueOrBuilder getAgeOrBuilder();

  /**
   * <code>.common.Address address = 3;</code>
   */
  boolean hasAddress();
  /**
   * <code>.common.Address address = 3;</code>
   */
  com.learning.models.Address getAddress();
  /**
   * <code>.common.Address address = 3;</code>
   */
  com.learning.models.AddressOrBuilder getAddressOrBuilder();

  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  java.util.List<com.learning.models.Car> 
      getCarList();
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  com.learning.models.Car getCar(int index);
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  int getCarCount();
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  java.util.List<? extends com.learning.models.CarOrBuilder> 
      getCarOrBuilderList();
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  com.learning.models.CarOrBuilder getCarOrBuilder(
      int index);
}
