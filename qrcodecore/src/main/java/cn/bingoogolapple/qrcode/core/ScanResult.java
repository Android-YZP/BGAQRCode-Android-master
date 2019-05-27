package cn.bingoogolapple.qrcode.core;

import android.graphics.Bitmap;
import android.graphics.PointF;

/**
 * 作者:王浩
 * 创建时间:2018/6/15
 * 描述:
 */
public class ScanResult {
    String result;
    PointF[] resultPoints;
    Bitmap bitmap;

    public ScanResult(String result, Bitmap bitmap) {
        this.result = result;
        this.bitmap = bitmap;
    }

    public ScanResult(String result, PointF[] resultPoints, Bitmap bitmap) {
        this.result = result;
        this.resultPoints = resultPoints;
        this.bitmap = bitmap;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public void setBitmap(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    public ScanResult(String result) {
        this.result = result;
    }

    public ScanResult(String result, PointF[] resultPoints) {
        this.result = result;
        this.resultPoints = resultPoints;
    }
}
