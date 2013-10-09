import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameConfigPresenter {

    private GameConfigView view;
    private GameConfigModel model;

    GameConfigPresenter(GameConfigView view, GameConfigModel model) {
	this.view = view;
	this.model = model;

	view.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent arg0) {
		onSubmit();
	    }
	});

	this.start();
    }

    public void onSubmit() {
	System.out.println("Difficulty is " + view.getDifficultyValue());
	model.setDifficulty(view.getDifficultyValue());
	model.setNumberOfPlayers(view.getNumberOfPlayersValue());
	model.setMapType(view.getMapTypeValue());
	//this.stop(); // TODO 
	PlayerConfigPresenter p = new PlayerConfigPresenter();
    }

    public void start() {
	view.show();
    }
    
    public void stop() {
	view.noShow();
    }
    

    public static void main(String[] args) {
	GameConfigView view = new GameConfigView();
	GameConfigModel model = new GameConfigModel();
	GameConfigPresenter p = new GameConfigPresenter(view, model);
    }

}
