import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameConfigPresenter {
	
	private GameConfigView view;
	private GameConfigModel model;
	
	GameConfigPresenter(GameConfigView view, GameConfigModel model)
	{
		this.view = view;
		this.model = model;
		
		view.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
               onSubmit();
            } } );	
		
		this.start();
	}
	
	public void onSubmit()
	{
		model.setDifficulty(view.getDifficultyValue());
		model.setNumberOfPlayers(view.getNumberOfPlayersValue());
		model.setMapType(view.getMapTypeValue());
		PlayerConfigPresenter p = new PlayerConfigPresenter();
	}
	
	public void start()
	{
		view.show();
	}
	
	
	public static void main(String[] args)
	{
		System.out.println("hello");
		GameConfigView view = new GameConfigView();
		GameConfigModel model = new GameConfigModel();
		GameConfigPresenter p = new GameConfigPresenter(view, model);
	}

}

