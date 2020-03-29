import java.rmi.*;

public interface Handler extends Remote
{
    public void updateUI(Player player, int stickId, int result) throws RemoteException;

}