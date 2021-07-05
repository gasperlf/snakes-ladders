// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: game-service.proto

package net.ontopsolutions.game;

/**
 * Protobuf type {@code GameState}
 */
public  final class GameState extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:GameState)
    GameStateOrBuilder {
  // Use GameState.newBuilder() to construct.
  private GameState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GameState() {
    player_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private GameState(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
              player_ = new java.util.ArrayList<net.ontopsolutions.game.Player>();
              mutable_bitField0_ |= 0x00000001;
            }
            player_.add(
                input.readMessage(net.ontopsolutions.game.Player.parser(), extensionRegistry));
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
      if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
        player_ = java.util.Collections.unmodifiableList(player_);
      }
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return net.ontopsolutions.game.GameServiceOuterClass.internal_static_GameState_descriptor;
  }

  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return net.ontopsolutions.game.GameServiceOuterClass.internal_static_GameState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            net.ontopsolutions.game.GameState.class, net.ontopsolutions.game.GameState.Builder.class);
  }

  public static final int PLAYER_FIELD_NUMBER = 1;
  private java.util.List<net.ontopsolutions.game.Player> player_;
  /**
   * <code>repeated .Player player = 1;</code>
   */
  public java.util.List<net.ontopsolutions.game.Player> getPlayerList() {
    return player_;
  }
  /**
   * <code>repeated .Player player = 1;</code>
   */
  public java.util.List<? extends net.ontopsolutions.game.PlayerOrBuilder> 
      getPlayerOrBuilderList() {
    return player_;
  }
  /**
   * <code>repeated .Player player = 1;</code>
   */
  public int getPlayerCount() {
    return player_.size();
  }
  /**
   * <code>repeated .Player player = 1;</code>
   */
  public net.ontopsolutions.game.Player getPlayer(int index) {
    return player_.get(index);
  }
  /**
   * <code>repeated .Player player = 1;</code>
   */
  public net.ontopsolutions.game.PlayerOrBuilder getPlayerOrBuilder(
      int index) {
    return player_.get(index);
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < player_.size(); i++) {
      output.writeMessage(1, player_.get(i));
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < player_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream
        .computeMessageSize(1, player_.get(i));
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof net.ontopsolutions.game.GameState)) {
      return super.equals(obj);
    }
    net.ontopsolutions.game.GameState other = (net.ontopsolutions.game.GameState) obj;

    boolean result = true;
    result = result && getPlayerList()
        .equals(other.getPlayerList());
    return result;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getPlayerCount() > 0) {
      hash = (37 * hash) + PLAYER_FIELD_NUMBER;
      hash = (53 * hash) + getPlayerList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static net.ontopsolutions.game.GameState parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.ontopsolutions.game.GameState parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.ontopsolutions.game.GameState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.ontopsolutions.game.GameState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.ontopsolutions.game.GameState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static net.ontopsolutions.game.GameState parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static net.ontopsolutions.game.GameState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.ontopsolutions.game.GameState parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.ontopsolutions.game.GameState parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static net.ontopsolutions.game.GameState parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static net.ontopsolutions.game.GameState parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static net.ontopsolutions.game.GameState parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(net.ontopsolutions.game.GameState prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
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
   * Protobuf type {@code GameState}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:GameState)
      net.ontopsolutions.game.GameStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.ontopsolutions.game.GameServiceOuterClass.internal_static_GameState_descriptor;
    }

    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.ontopsolutions.game.GameServiceOuterClass.internal_static_GameState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.ontopsolutions.game.GameState.class, net.ontopsolutions.game.GameState.Builder.class);
    }

    // Construct using net.ontopsolutions.game.GameState.newBuilder()
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
        getPlayerFieldBuilder();
      }
    }
    public Builder clear() {
      super.clear();
      if (playerBuilder_ == null) {
        player_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
      } else {
        playerBuilder_.clear();
      }
      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return net.ontopsolutions.game.GameServiceOuterClass.internal_static_GameState_descriptor;
    }

    public net.ontopsolutions.game.GameState getDefaultInstanceForType() {
      return net.ontopsolutions.game.GameState.getDefaultInstance();
    }

    public net.ontopsolutions.game.GameState build() {
      net.ontopsolutions.game.GameState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public net.ontopsolutions.game.GameState buildPartial() {
      net.ontopsolutions.game.GameState result = new net.ontopsolutions.game.GameState(this);
      int from_bitField0_ = bitField0_;
      if (playerBuilder_ == null) {
        if (((bitField0_ & 0x00000001) == 0x00000001)) {
          player_ = java.util.Collections.unmodifiableList(player_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.player_ = player_;
      } else {
        result.player_ = playerBuilder_.build();
      }
      onBuilt();
      return result;
    }

    public Builder clone() {
      return (Builder) super.clone();
    }
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.setField(field, value);
    }
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return (Builder) super.clearField(field);
    }
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return (Builder) super.clearOneof(oneof);
    }
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, Object value) {
      return (Builder) super.setRepeatedField(field, index, value);
    }
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        Object value) {
      return (Builder) super.addRepeatedField(field, value);
    }
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof net.ontopsolutions.game.GameState) {
        return mergeFrom((net.ontopsolutions.game.GameState)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(net.ontopsolutions.game.GameState other) {
      if (other == net.ontopsolutions.game.GameState.getDefaultInstance()) return this;
      if (playerBuilder_ == null) {
        if (!other.player_.isEmpty()) {
          if (player_.isEmpty()) {
            player_ = other.player_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensurePlayerIsMutable();
            player_.addAll(other.player_);
          }
          onChanged();
        }
      } else {
        if (!other.player_.isEmpty()) {
          if (playerBuilder_.isEmpty()) {
            playerBuilder_.dispose();
            playerBuilder_ = null;
            player_ = other.player_;
            bitField0_ = (bitField0_ & ~0x00000001);
            playerBuilder_ = 
              com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                 getPlayerFieldBuilder() : null;
          } else {
            playerBuilder_.addAllMessages(other.player_);
          }
        }
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      net.ontopsolutions.game.GameState parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (net.ontopsolutions.game.GameState) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private java.util.List<net.ontopsolutions.game.Player> player_ =
      java.util.Collections.emptyList();
    private void ensurePlayerIsMutable() {
      if (!((bitField0_ & 0x00000001) == 0x00000001)) {
        player_ = new java.util.ArrayList<net.ontopsolutions.game.Player>(player_);
        bitField0_ |= 0x00000001;
       }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.ontopsolutions.game.Player, net.ontopsolutions.game.Player.Builder, net.ontopsolutions.game.PlayerOrBuilder> playerBuilder_;

    /**
     * <code>repeated .Player player = 1;</code>
     */
    public java.util.List<net.ontopsolutions.game.Player> getPlayerList() {
      if (playerBuilder_ == null) {
        return java.util.Collections.unmodifiableList(player_);
      } else {
        return playerBuilder_.getMessageList();
      }
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public int getPlayerCount() {
      if (playerBuilder_ == null) {
        return player_.size();
      } else {
        return playerBuilder_.getCount();
      }
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public net.ontopsolutions.game.Player getPlayer(int index) {
      if (playerBuilder_ == null) {
        return player_.get(index);
      } else {
        return playerBuilder_.getMessage(index);
      }
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public Builder setPlayer(
        int index, net.ontopsolutions.game.Player value) {
      if (playerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlayerIsMutable();
        player_.set(index, value);
        onChanged();
      } else {
        playerBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public Builder setPlayer(
        int index, net.ontopsolutions.game.Player.Builder builderForValue) {
      if (playerBuilder_ == null) {
        ensurePlayerIsMutable();
        player_.set(index, builderForValue.build());
        onChanged();
      } else {
        playerBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public Builder addPlayer(net.ontopsolutions.game.Player value) {
      if (playerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlayerIsMutable();
        player_.add(value);
        onChanged();
      } else {
        playerBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public Builder addPlayer(
        int index, net.ontopsolutions.game.Player value) {
      if (playerBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensurePlayerIsMutable();
        player_.add(index, value);
        onChanged();
      } else {
        playerBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public Builder addPlayer(
        net.ontopsolutions.game.Player.Builder builderForValue) {
      if (playerBuilder_ == null) {
        ensurePlayerIsMutable();
        player_.add(builderForValue.build());
        onChanged();
      } else {
        playerBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public Builder addPlayer(
        int index, net.ontopsolutions.game.Player.Builder builderForValue) {
      if (playerBuilder_ == null) {
        ensurePlayerIsMutable();
        player_.add(index, builderForValue.build());
        onChanged();
      } else {
        playerBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public Builder addAllPlayer(
        java.lang.Iterable<? extends net.ontopsolutions.game.Player> values) {
      if (playerBuilder_ == null) {
        ensurePlayerIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(
            values, player_);
        onChanged();
      } else {
        playerBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public Builder clearPlayer() {
      if (playerBuilder_ == null) {
        player_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        playerBuilder_.clear();
      }
      return this;
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public Builder removePlayer(int index) {
      if (playerBuilder_ == null) {
        ensurePlayerIsMutable();
        player_.remove(index);
        onChanged();
      } else {
        playerBuilder_.remove(index);
      }
      return this;
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public net.ontopsolutions.game.Player.Builder getPlayerBuilder(
        int index) {
      return getPlayerFieldBuilder().getBuilder(index);
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public net.ontopsolutions.game.PlayerOrBuilder getPlayerOrBuilder(
        int index) {
      if (playerBuilder_ == null) {
        return player_.get(index);  } else {
        return playerBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public java.util.List<? extends net.ontopsolutions.game.PlayerOrBuilder> 
         getPlayerOrBuilderList() {
      if (playerBuilder_ != null) {
        return playerBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(player_);
      }
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public net.ontopsolutions.game.Player.Builder addPlayerBuilder() {
      return getPlayerFieldBuilder().addBuilder(
          net.ontopsolutions.game.Player.getDefaultInstance());
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public net.ontopsolutions.game.Player.Builder addPlayerBuilder(
        int index) {
      return getPlayerFieldBuilder().addBuilder(
          index, net.ontopsolutions.game.Player.getDefaultInstance());
    }
    /**
     * <code>repeated .Player player = 1;</code>
     */
    public java.util.List<net.ontopsolutions.game.Player.Builder> 
         getPlayerBuilderList() {
      return getPlayerFieldBuilder().getBuilderList();
    }
    private com.google.protobuf.RepeatedFieldBuilderV3<
        net.ontopsolutions.game.Player, net.ontopsolutions.game.Player.Builder, net.ontopsolutions.game.PlayerOrBuilder> 
        getPlayerFieldBuilder() {
      if (playerBuilder_ == null) {
        playerBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
            net.ontopsolutions.game.Player, net.ontopsolutions.game.Player.Builder, net.ontopsolutions.game.PlayerOrBuilder>(
                player_,
                ((bitField0_ & 0x00000001) == 0x00000001),
                getParentForChildren(),
                isClean());
        player_ = null;
      }
      return playerBuilder_;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:GameState)
  }

  // @@protoc_insertion_point(class_scope:GameState)
  private static final net.ontopsolutions.game.GameState DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new net.ontopsolutions.game.GameState();
  }

  public static net.ontopsolutions.game.GameState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GameState>
      PARSER = new com.google.protobuf.AbstractParser<GameState>() {
    public GameState parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
        return new GameState(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GameState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GameState> getParserForType() {
    return PARSER;
  }

  public net.ontopsolutions.game.GameState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

