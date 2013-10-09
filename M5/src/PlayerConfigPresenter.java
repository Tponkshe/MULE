import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PlayerConfigPresenter {

    private PlayerConfigView view;
    private PlayerConfigModel model;

    public PlayerConfigPresenter() {
	this.view = new PlayerConfigView();
	this.model = new PlayerConfigModel();
	view.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent arg0) {
		onSubmit();
	    }
	});

	this.start();
    }

    public void onSubmit() {
	model.setName(view.getNameValue());
	model.setRace(view.getRaceValue());
	model.setColor(view.getColorValue());
    }

    public void start() {
	System.out.println("In presenter of player");
	view.show();
    }

    /*
     * public static void main(String[] args) {
     * 
     * view = new PlayerConfigView(); model = new PlayerConfigModel(); int n =
     * GameConfigModel.getNumberOfPlayers(); PlayerConfigPresenter p[] = null;
     * for(int i=0; i<n; i++) p[i] = new PlayerConfigPresenter(view, model); }
     */

}
