package seven_kyu;

/*

* In a small town the population is p0 = 1000 at the beginning of a year.
* The population regularly increases by 2 percent per year
* and moreover 50 new inhabitants per year come to live in the town.
* How many years does the town need to see its population greater
* or equal to p = 1200 inhabitants?
*
* More generally given parameters:
* p0, percent, aug (inhabitants coming or leaving each year), p (population to equal or surpass)
* the function nb_year should return n number of entire years needed
* to get a population greater or equal to p.
*
* aug is an integer, percent a positive or null floating number,
* p0 and p are positive integers (> 0)

*/

public class GrowthOfPopulation {

    public static int nbYear(int p0, double percent, int aug, int p) {
        if (p0 >= p) return 0;

        int population = (int) (p0 * ( 1 + percent/100) + aug);

        return nbYear(population, percent, aug, p) + 1;
    }

}
