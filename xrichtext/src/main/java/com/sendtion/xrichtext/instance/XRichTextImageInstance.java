package com.sendtion.xrichtext.instance;

import android.widget.ImageView;

import com.sendtion.xrichtext.entity.IImageGetEntity;
import com.sendtion.xrichtext.entity.IImageLoader;

public class XRichTextImageInstance {
    private static XRichTextImageInstance instance;
    private IImageGetEntity iImageGetEntity;
    private IImageLoader iImageLoader;

    public static XRichTextImageInstance getInstance() {
        if (instance == null)
            instance = new XRichTextImageInstance();
        return instance;
    }

    public void setIImageGetEntity(IImageGetEntity iImageGetEntity) {
        this.iImageGetEntity = iImageGetEntity;
    }

    public String getImagePath(Object object) {
        if (iImageGetEntity != null) {
            return iImageGetEntity.getImagePath(object);
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