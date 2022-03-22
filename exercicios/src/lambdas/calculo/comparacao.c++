# include <stdio.h>

int main(void)
{
    auto calculo = [](double a, double b){return a + b;};
    printf("%f\n", calculo(1, 2));

    return 0;
}
