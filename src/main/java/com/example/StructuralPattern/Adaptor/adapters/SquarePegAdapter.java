package com.example.StructuralPattern.Adaptor.adapters;

import com.example.StructuralPattern.Adaptor.round.RoundPeg;
import com.example.StructuralPattern.Adaptor.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
    private SquarePeg sp;

    public SquarePegAdapter(SquarePeg sp) {
        this.sp = sp;
    }

    @Override
    public double getRadius() {
        return this.sp.getWidth() / Math.sqrt(2);
    }
}
