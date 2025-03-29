
public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        int totalD = model.getHeight();
        int fromT = 0;
        int toT = 2;
        int tempT = 1;
        solve(totalD, fromT, toT, tempT);
    }

    // Create an overloaded solve(...) method
    // This new method will be recursive (call itself)
    //
    // [ solve method here]
    //

    private void solve(int n, int source, int destination, int auxiliary)
    {
        if (n <= 0)
        {
            return;
        }
        else
        {
            solve(n - 1, source, auxiliary, destination);
            model.move(source, destination);
            solve(n - 1, auxiliary, destination, source);
        }
    }
}
