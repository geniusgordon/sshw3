package game;

import java.awt.Rectangle;
import java.util.LinkedList;
import java.util.Queue;

import javax.swing.JFrame;

import model.Model;

public class Game extends JFrame implements Runnable {
	
	private final static int STAGE_AMOUNT = 3;
	private Rectangle bounds = new Rectangle(1000,700);
	private int maxLife = 3;
	private Topbar topbar = new Topbar(new Rectangle(bounds.width, 40), maxLife);
	private Thread gameThread = null;
	private final static int DELAY = 20;
	private Model model = new Model();
	private GameStage currentStage;
	/* Create a Queue called "stages" to put game stage in */
	private Queue<GameStage> stages;
	
	/*Initialize everything you need in this constructor.*/
	public Game() {
		super();
		this.setVisible(false);
		this.setBounds(this.bounds);
		this.setLayout(null);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.produceStages(STAGE_AMOUNT);
	}
	
	public void start() {
		if (this.gameThread == null) {
            this.gameThread = new Thread(this);
        }
		this.gameThread.start();
		this.setVisible(true);
	}
	
	private void nextStage() {
		this.currentStage = this.stages.poll();
		this.currentStage.requestFocus();
	}
	
	/**
	 * void produceStages(int num)
	 * 		Generate the stages before we start gaming.
	 * 
	 * @input num: number of stages that user wants to generate
	 * 
	 * */
	private void produceStages(int num) {
		/*implement your procedures here*/
	}
	
	@Override
	public void run() {
		long t = System.currentTimeMillis();
		while (Thread.currentThread() == this.gameThread) {
            try {
            	/*
    			 * Something is missing!!
    			 * 
    			 * Add your code to finish remaining methods that control the game process, such as
    			 * checking whether the player pass the stage or not, win the game or not etc.
    			 * 
    			 * */
                this.repaint();
                t += DELAY;
                Thread.sleep(Math.max(0, t - System.currentTimeMillis()));
            }
            catch (InterruptedException e) {
            	break;
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			}
        }
	}

}
