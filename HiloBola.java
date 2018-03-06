
public class HiloBola implements Runnable {

	private Ball bola;
	private Board board;

	public HiloBola(Ball bola, Board board) {
		this.bola = bola;
		this.board = board;
	}

	@Override
	public void run() {

		try {
			while (!Thread.currentThread().isInterrupted() && !(bola.getV() < 0)) {
				bola.move();
				board.repaint(); 
				Thread.sleep(4);
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
