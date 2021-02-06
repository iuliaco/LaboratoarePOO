public class TwentyStrategy implements Strategy{

    @Override
    public float calcul(int aniVechime, float salariu) {
        return (float)aniVechime/20 *salariu;
    }
}
