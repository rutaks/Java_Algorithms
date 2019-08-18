// A child is playing with a ball on the nth floor of a tall building. The height of this floor, h, is known.
// He drops the ball out of the window. The ball bounces (for example), to two-thirds of its height (a bounce of 0.66).
// His mother looks out of a window 1.5 meters from the ground.
// How many times will the mother see the ball pass in front of her window (including when it's falling and bouncing?
public class BouncingBalls {
    public static int bouncingBall(double h, double bounce, double window) {
    if ((h <= 0) || (window >= h) || (bounce <= 0) || (bounce >= 1))
      return -1;
    int seen = -1;
    while (h > window) {
          seen += 2;
          h = h * bounce;
    }
    return seen;
	}
}