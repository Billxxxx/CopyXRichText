package com.sendtion.xrichtext.instance;

import android.widget.ImageView;

import com.sendtion.xrichtext.entity.IImageGetEntity;
import com.sendtion.xrichtext.entity.IImageLoader;

public class ImageInstance {
    private static ImageInstance instance;
    private IImageGetEntity entity;
    private IImageLoader iImageLoader;

    public static ImageInstance getInstance() {
        if (instance == null)
            instance = new ImageInstance();
        return instance;
    }

    public void setEntity(IImageGetEntity entity) {
        this.entity = entity;
    }

    public String getImagePath(Object object) {
        if (entity != null) {
            return entity.getImagePath(object);
        } else return null;
    }

    public void setIImageLoader(IImageLoader iImageLoader) {
        this.iImageLoader = iImageLoader;
    }

    public void loadImage(String path, ImageView imageView) {
        if (iImageLoader != null)
            iImageLoader.loadImage(path, imageView);
    }
}
