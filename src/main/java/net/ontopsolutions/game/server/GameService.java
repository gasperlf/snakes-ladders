package net.ontopsolutions.game.server;

import io.grpc.stub.StreamObserver;
import net.ontopsolutions.game.Die;
import net.ontopsolutions.game.GameServiceGrpc;
import net.ontopsolutions.game.GameServiceGrpc.GameServiceImplBase;
import net.ontopsolutions.game.GameState;
import net.ontopsolutions.game.Player;

public class GameService extends GameServiceImplBase {

    @Override
    public StreamObserver<Die> roll(StreamObserver<GameState> responseObserver) {
        Player client = Player.newBuilder().setName("client").setPosition(0).build();
        Player server = Player.newBuilder().setName("server").setPosition(0).build();
        return new DieStreamingRequest(client, server, responseObserver);
    }
}
