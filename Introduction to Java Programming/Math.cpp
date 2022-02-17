/* Guide to class math in C++
 *
 * Author : Giorgio Murad Murad
 */
#include <iostream>
#include <cmath>

using namespace std;
int main()
{
    double x;
    double y;
    double z;
    double n;

    /* max(x, y)
     * Returns the highest value
     */
    x = 5;
    y = 10;
    z = max(x, y);
    //Output : 10



    /* min(x, y)
     * Returns the least value
     */
    x = 5;
    y = 10;
    z = min(x, y);
    //Output : 5



    /* fma(x, y, z)
     * Returns x * y + z
     */
    x = 10;
    y = 2;
    z = 4;
    n = fma(x, y, z);
    //Output : 24



    /* sqrt(x)
     * Returns the square root of a value
     */
    x = 16;
    z = sqrt(x);
    //Output : 4



    /* hypot(x, y)
     * Returns the hypotenuse of the two values
     */
    x = 3;
    y = 4;
    z = hypot(x, y);
    //Output : 5



    /* cbrt(x)
     * Returns the cube root of a value
     */
    x = 125;
    z = cbrt(x);
    //Output : 5



    /* log(x)
     * Returns the logarithm of a value
     */
    x = 64;
    z = log(x);
    //Output : 4



    /* round(x)
     * Returns the rounded value of a number
     */
    x = 2.3;
    z = round(x);
    //Output : 2

    x = 2.7;
    z = round(x);
    //Output : 3



    /* ceil(x)
     * Returns the value rounded up to the nearest integer
     */
    x = 2.3;
    z = ceil(x);
    //Output : 3



    /* floor(x)
     * Returns the value rounded down to the nearest integer
     */
    x = 6.9;
    z = floor(x);
    //Output : 6



    /* abs(x)
     * Returns the absolute value of a value
     */
    x = -6.2;
    z = abs(x);
    //Output : 6



    /* pow(x, y)
     * Returns x to the power of y
     */
    x = 4;
    y = 3;
    z = pow(x, y);
    //Output : 64
}
