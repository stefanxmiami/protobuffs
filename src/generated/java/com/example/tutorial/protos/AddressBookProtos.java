// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: com/example/tutorial/protos/adressbook.proto

package com.example.tutorial.protos;

public final class AddressBookProtos {
  private AddressBookProtos() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_User_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_User_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_tutorial_AddressBook_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_tutorial_AddressBook_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n,com/example/tutorial/protos/adressbook" +
      ".proto\022\010tutorial\"/\n\004User\022\014\n\004name\030\001 \001(\t\022\n" +
      "\n\002id\030\002 \001(\005\022\r\n\005email\030\003 \001(\t\"-\n\013AddressBook" +
      "\022\036\n\006people\030\001 \003(\0132\016.tutorial.UserB2\n\033com." +
      "example.tutorial.protosB\021AddressBookProt" +
      "osP\001b\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_tutorial_User_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_tutorial_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_User_descriptor,
        new java.lang.String[] { "Name", "Id", "Email", });
    internal_static_tutorial_AddressBook_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_tutorial_AddressBook_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_tutorial_AddressBook_descriptor,
        new java.lang.String[] { "People", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}