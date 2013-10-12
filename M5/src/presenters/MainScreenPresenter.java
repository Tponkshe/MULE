package presenters;
import views.*;
import models.*;
/**
 * @author yee
 * GUI for main screen
 */
public class MainScreenPresenter {

    private View view;
    private PlayerConfigModel model;
    private MainScreenPanel panel;

    public MainScreenPresenter(View view, PlayerConfigModel model) {
	this.view = view;
	this.model = model;
	this.panel = new MainScreenPanel();

	this.view.setPanel(this.panel);
	for (int i = 0; i < model.getNumPlayers(); i++) {
	    //System.out.println(model.getPlayer(i).getRace());
	    panel.setRaceLabel(i, model.getPlayer(i).getRace());
	}
    }
}
