package com.tonymaces.mycardview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by tonym on 05/07/2016.
 */
public class CarAdapter extends  RecyclerView.Adapter<CarAdapter.CarViewHolder> {

    private List<Car> mCars;

    public CarAdapter(List<Car> cars) {
        this.mCars = cars;
    }

    @Override

    public CarViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
      View itemView =  LayoutInflater.from(parent.getContext()).inflate(R.layout.car_item,parent,false);
        return new CarViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(CarViewHolder holder, int position) {
        Car car = mCars.get(position);
        holder.mPhoto.setImageResource(car.getPhoto());
        holder.mName.setText(car.getName());
    }

    @Override
    public int getItemCount() {
        return  mCars.size();
    }

    public  static class CarViewHolder extends RecyclerView.ViewHolder{

        private ImageView mPhoto;
        private TextView mName;

        public CarViewHolder(View itemView) {
            super(itemView);
            mPhoto = (ImageView) itemView.findViewById(R.id.imgPhoto);
            mName = (TextView) itemView.findViewById(R.id.tvName);
        }
    }

}
