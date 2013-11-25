package com.ladr.misc.mytestbabyroot;

/**
 * Created by lychak on 23.11.13.
 */
public class BabyRoot {
    private Float a, b, x, S, eps;
    private static final float EPS_DEFAULT = 0.001f;

    public BabyRoot(Float n)
    {
        this(n, EPS_DEFAULT);
    }

    public BabyRoot(Float n, Float eps)
    {
        x = n;
        eps = eps;

        a = 1f;
        b = x;
        S = x;
    }

    public void SetEps(Float eps)
    {
        eps = eps;
    }

    public void SetNumber(Float n)
    {
        x = n;
    }

    public Float Solve()
    {
        while (a - b > eps)
        {
            a = (a + b)/2;
            b = S/a;
        }
        return a;
    }

    public Float BabySolve(float n)
    {
        float a = n;
        float x = 1;

        for (int i = 0; Math.abs(x-a) > eps; i++)
        {
            x = 0.5f * (x + a / x);
        }

        return x;
    }
}
