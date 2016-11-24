package nguyenducthuan.examplebai8;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;


/**
 * Created by ndthu on 11/24/2016.
 */

public class CanvasDraw extends View {
    Paint paint;

    public CanvasDraw(Context context){
        super(context);
    }

    public CanvasDraw(Context context, AttributeSet attrs){
        super(context, attrs);
        paint = new Paint();
        paint.setColor(Color.BLUE);
        paint.setStrokeWidth(20);
    }

    public void onDraw(Canvas canvas){
        super.onDraw(canvas);
        int startX = 0, startY = 0;
        int stopX = getWidth(), stopY = getHeight();
        canvas.drawLine(startX, startY, stopX, stopY, paint);
    }
}
