package com.google.android.material.timepicker;

import android.annotation.SuppressLint;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Checkable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.c;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import java.util.Locale;
import java.util.WeakHashMap;
import p0.a;
import p0.e0;
import p0.m0;

/* JADX INFO: loaded from: classes2.dex */
class TimePickerView extends ConstraintLayout implements TimePickerControls {
    public static final String GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME = "android.view.View";
    private final ClockFaceView clockFace;
    private final ClockHandView clockHandView;
    private final Chip hourView;
    private final Chip minuteView;
    private OnDoubleTapListener onDoubleTapListener;
    private OnPeriodChangeListener onPeriodChangeListener;
    private OnSelectionChange onSelectionChangeListener;
    private final View.OnClickListener selectionListener;
    private final MaterialButtonToggleGroup toggle;

    public interface OnDoubleTapListener {
        void onDoubleTap();
    }

    public interface OnPeriodChangeListener {
        void onPeriodChange(int i10);
    }

    public interface OnSelectionChange {
        void onSelectionChanged(int i10);
    }

    public TimePickerView(Context context) {
        this(context, null);
    }

    public TimePickerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public TimePickerView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.selectionListener = new View.OnClickListener() { // from class: com.google.android.material.timepicker.TimePickerView.1
            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                if (TimePickerView.this.onSelectionChangeListener != null) {
                    TimePickerView.this.onSelectionChangeListener.onSelectionChanged(((Integer) view.getTag(R.id.selection_type)).intValue());
                }
            }
        };
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        this.clockFace = (ClockFaceView) findViewById(R.id.material_clock_face);
        MaterialButtonToggleGroup materialButtonToggleGroup = (MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle);
        this.toggle = materialButtonToggleGroup;
        materialButtonToggleGroup.addOnButtonCheckedListener(new MaterialButtonToggleGroup.OnButtonCheckedListener() { // from class: com.google.android.material.timepicker.TimePickerView.2
            @Override // com.google.android.material.button.MaterialButtonToggleGroup.OnButtonCheckedListener
            public void onButtonChecked(MaterialButtonToggleGroup materialButtonToggleGroup2, int i11, boolean z10) {
                int i12 = i11 == R.id.material_clock_period_pm_button ? 1 : 0;
                if (TimePickerView.this.onPeriodChangeListener == null || !z10) {
                    return;
                }
                TimePickerView.this.onPeriodChangeListener.onPeriodChange(i12);
            }
        });
        this.minuteView = (Chip) findViewById(R.id.material_minute_tv);
        this.hourView = (Chip) findViewById(R.id.material_hour_tv);
        this.clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        setupDoubleTap();
        setUpDisplay();
    }

    private void setUpDisplay() {
        Chip chip = this.minuteView;
        int i10 = R.id.selection_type;
        chip.setTag(i10, 12);
        this.hourView.setTag(i10, 10);
        this.minuteView.setOnClickListener(this.selectionListener);
        this.hourView.setOnClickListener(this.selectionListener);
        this.minuteView.setAccessibilityClassName(GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME);
        this.hourView.setAccessibilityClassName(GENERIC_VIEW_ACCESSIBILITY_CLASS_NAME);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    private void setupDoubleTap() {
        final GestureDetector gestureDetector = new GestureDetector(getContext(), new GestureDetector.SimpleOnGestureListener() { // from class: com.google.android.material.timepicker.TimePickerView.3
            @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
            public boolean onDoubleTap(MotionEvent motionEvent) {
                OnDoubleTapListener onDoubleTapListener = TimePickerView.this.onDoubleTapListener;
                if (onDoubleTapListener == null) {
                    return false;
                }
                onDoubleTapListener.onDoubleTap();
                return true;
            }
        });
        View.OnTouchListener onTouchListener = new View.OnTouchListener() { // from class: com.google.android.material.timepicker.TimePickerView.4
            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.view.View.OnTouchListener
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if (((Checkable) view).isChecked()) {
                    return gestureDetector.onTouchEvent(motionEvent);
                }
                return false;
            }
        };
        this.minuteView.setOnTouchListener(onTouchListener);
        this.hourView.setOnTouchListener(onTouchListener);
    }

    private void updateSelection(Chip chip, boolean z10) {
        chip.setChecked(z10);
        int i10 = z10 ? 2 : 0;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.g.f(chip, i10);
    }

    private void updateToggleConstraints() {
        c.a aVar;
        if (this.toggle.getVisibility() == 0) {
            c cVar = new c();
            cVar.e(this);
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            char c10 = e0.e.d(this) == 0 ? (char) 2 : (char) 1;
            int i10 = R.id.material_clock_display;
            if (cVar.f1509f.containsKey(Integer.valueOf(i10)) && (aVar = cVar.f1509f.get(Integer.valueOf(i10))) != null) {
                switch (c10) {
                    case 1:
                        c.b bVar = aVar.f1514e;
                        bVar.f1549j = -1;
                        bVar.f1547i = -1;
                        bVar.G = -1;
                        bVar.N = Integer.MIN_VALUE;
                        break;
                    case 2:
                        c.b bVar2 = aVar.f1514e;
                        bVar2.f1553l = -1;
                        bVar2.f1551k = -1;
                        bVar2.H = -1;
                        bVar2.P = Integer.MIN_VALUE;
                        break;
                    case 3:
                        c.b bVar3 = aVar.f1514e;
                        bVar3.f1557n = -1;
                        bVar3.f1555m = -1;
                        bVar3.I = 0;
                        bVar3.O = Integer.MIN_VALUE;
                        break;
                    case 4:
                        c.b bVar4 = aVar.f1514e;
                        bVar4.f1559o = -1;
                        bVar4.f1561p = -1;
                        bVar4.J = 0;
                        bVar4.Q = Integer.MIN_VALUE;
                        break;
                    case 5:
                        c.b bVar5 = aVar.f1514e;
                        bVar5.f1563q = -1;
                        bVar5.f1564r = -1;
                        bVar5.f1565s = -1;
                        bVar5.M = 0;
                        bVar5.T = Integer.MIN_VALUE;
                        break;
                    case 6:
                        c.b bVar6 = aVar.f1514e;
                        bVar6.f1566t = -1;
                        bVar6.f1567u = -1;
                        bVar6.L = 0;
                        bVar6.S = Integer.MIN_VALUE;
                        break;
                    case 7:
                        c.b bVar7 = aVar.f1514e;
                        bVar7.f1568v = -1;
                        bVar7.f1569w = -1;
                        bVar7.K = 0;
                        bVar7.R = Integer.MIN_VALUE;
                        break;
                    case '\b':
                        c.b bVar8 = aVar.f1514e;
                        bVar8.C = -1.0f;
                        bVar8.B = -1;
                        bVar8.A = -1;
                        break;
                    default:
                        throw new IllegalArgumentException("unknown constraint");
                }
            }
            cVar.c(this, true);
            setConstraintSet(null);
            requestLayout();
        }
    }

    public void addOnRotateListener(ClockHandView.OnRotateListener onRotateListener) {
        this.clockHandView.addOnRotateListener(onRotateListener);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        updateToggleConstraints();
    }

    @Override // android.view.View
    public void onVisibilityChanged(View view, int i10) {
        super.onVisibilityChanged(view, i10);
        if (view == this && i10 == 0) {
            updateToggleConstraints();
        }
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setActiveSelection(int i10) {
        updateSelection(this.minuteView, i10 == 12);
        updateSelection(this.hourView, i10 == 10);
    }

    public void setAnimateOnTouchUp(boolean z10) {
        this.clockHandView.setAnimateOnTouchUp(z10);
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setHandRotation(float f10) {
        this.clockHandView.setHandRotation(f10);
    }

    public void setHandRotation(float f10, boolean z10) {
        this.clockHandView.setHandRotation(f10, z10);
    }

    public void setHourClickDelegate(a aVar) {
        e0.q(this.minuteView, aVar);
    }

    public void setMinuteHourDelegate(a aVar) {
        e0.q(this.hourView, aVar);
    }

    public void setOnActionUpListener(ClockHandView.OnActionUpListener onActionUpListener) {
        this.clockHandView.setOnActionUpListener(onActionUpListener);
    }

    public void setOnDoubleTapListener(OnDoubleTapListener onDoubleTapListener) {
        this.onDoubleTapListener = onDoubleTapListener;
    }

    public void setOnPeriodChangeListener(OnPeriodChangeListener onPeriodChangeListener) {
        this.onPeriodChangeListener = onPeriodChangeListener;
    }

    public void setOnSelectionChangeListener(OnSelectionChange onSelectionChange) {
        this.onSelectionChangeListener = onSelectionChange;
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    public void setValues(String[] strArr, int i10) {
        this.clockFace.setValues(strArr, i10);
    }

    public void showToggle() {
        this.toggle.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.TimePickerControls
    @SuppressLint({"DefaultLocale"})
    public void updateTime(int i10, int i11, int i12) {
        this.toggle.check(i10 == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button);
        Locale locale = getResources().getConfiguration().locale;
        String str = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i12));
        String str2 = String.format(locale, TimeModel.ZERO_LEADING_NUMBER_FORMAT, Integer.valueOf(i11));
        if (!TextUtils.equals(this.minuteView.getText(), str)) {
            this.minuteView.setText(str);
        }
        if (TextUtils.equals(this.hourView.getText(), str2)) {
            return;
        }
        this.hourView.setText(str2);
    }
}
