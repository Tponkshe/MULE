package presenters;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.*;
import models.*;

/**
 * @author yee
 *
 */
public class PlayerConfigPresenter {

    private View view;
    private PlayerConfigModel model;
    private PlayerConfigPanel panel;
    private int numPlayers;

    /**
     * Initalizes the model and view, changes the panel to PlayerConfigPanel
     * @param view
     * @param numPlayers
     */
    public PlayerConfigPresenter(View view, int numPlayers) {
	this.numPlayers = numPlayers;
	this.view = view;
	this.model = new PlayerConfigModel(numPlayers);
	this.panel = new PlayerConfigPanel(numPlayers);

	this.view.setPanel(this.panel);
	this.view.addActionListener(new ActionListener() {

	    @Override
	    public void actionPerformed(ActionEvent arg0) {
		onSubmit();
	    }
	});
    }

    
    /**
     *  Update the Player Models for names, races, colors
     */
    public void onSubmit() {
	// STEP 3: UPDATE IN THE MODEL THE VALUE YOU GET FROM VIEW

	// update names in model
	for (int i = 0; i < 4; i++) {
	    model.getPlayer(i).setName(view.getPlayerNames()[i]);
	    System.out.println("Name set to " + view.getPlayerNames()[i]
		    + " for Player " + i);
	}

	// update races in model
	for (int i = 0; i < 4; i++) {
	    model.getPlayer(i).setRace(view.getPlayerRaces()[i]);
	    System.out.println("Race set to " + view.getPlayerRaces()[i] + " for player " + i);
	}

	// update color in model
	for (int i = 0; i < 4; i++) {
	    model.getPlayer(i).setColor(view.getPlayerColors()[i]);
	    System.out.println("Color set to " + view.getPlayerColors()[i] + " for player" + i);
	}
	
	// create next screen 
	MainScreenPresenter p = new MainScreenPresenter(this.view, this.model);
    }

}
