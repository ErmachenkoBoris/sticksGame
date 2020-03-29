import java.rmi.*;

public interface PlayerHandler extends Remote
{
    public void addNewPlayer(Player player) throws RemoteException;


    public void playerTurn(Player player, int stickId, int result)
            throws RemoteException;

    public void setPlayerResult(Player player, int result)
            throws RemoteException;

    public int getPlayerResult(Player player)
            throws RemoteException;
}