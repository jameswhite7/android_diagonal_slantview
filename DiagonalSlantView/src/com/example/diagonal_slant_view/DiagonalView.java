package com.example.diagonal_slant_view;  

  import android.content.Context; 
import android.graphics.Canvas; 
import android.graphics.Color;
import android.graphics.Paint; 
import android.graphics.Path; 
import android.util.AttributeSet; 
import android.view.View; 

  public class DiagonalView extends View { 
  private Paint bgPaint; 

  public DiagonalView (Context context) { 
  super (context); 
  init (); 
  } 

  public DiagonalView (Context context, AttributeSet attrs) { 
  super (context, attrs); 
  init (); 
  } 

  public DiagonalView (Context context, AttributeSet attrs, int defStyleAttr) { 
  super (context, attrs, defStyleAttr); 
  init (); 
  } 

  private void init () { 
  bgPaint = new Paint (); 
  bgPaint.setFlags (Paint.ANTI_ALIAS_FLAG); 
  bgPaint.setStyle (Paint.Style.FILL); 
/*  bgPaint.setColor (getResources (). getColor (R.color.colorPrimary)); */
  
  bgPaint.setColor(Color.parseColor("#82AD75"));
  } 

  @Override 
  protected void onMeasure (int widthMeasureSpec, int heightMeasureSpec) { 
  super.onMeasure (widthMeasureSpec, heightMeasureSpec); 
  } 

  @Override 
  protected void onDraw (Canvas canvas) { 
  super.onDraw (canvas); 

  int h = getMeasuredHeight (); 
  int w = getMeasuredWidth (); 

  Path path = new Path (); 
  path.lineTo (w, 0); 
  path.lineTo (w, h / 4); 
  path.lineTo (0, h / 2); 
  path.close (); 
  canvas.drawPath (path, bgPaint); 
  } 
  } 