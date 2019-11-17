package es.urjccode.mastercloudapps.adcs.draughts.models;

public interface PieceProvider {
    boolean isEmpty(Coordinate coordinate);
    Piece getPiece(Coordinate coordinate);
}
