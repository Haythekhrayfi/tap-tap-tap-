package com.google.android.material.textfield;

import android.annotation.SuppressLint;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.y0;
import com.google.android.material.R;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import java.util.WeakHashMap;
import p0.e0;
import p0.h;
import p0.m0;
import q0.c;

/* JADX INFO: loaded from: classes2.dex */
@SuppressLint({"ViewConstructor"})
class StartCompoundLayout extends LinearLayout {
    private boolean hintExpanded;
    private CharSequence prefixText;
    private final TextView prefixTextView;
    private View.OnLongClickListener startIconOnLongClickListener;
    private ColorStateList startIconTintList;
    private PorterDuff.Mode startIconTintMode;
    private final CheckableImageButton startIconView;
    private final TextInputLayout textInputLayout;

    public StartCompoundLayout(TextInputLayout textInputLayout, y0 y0Var) {
        super(textInputLayout.getContext());
        this.textInputLayout = textInputLayout;
        setVisibility(8);
        setOrientation(0);
        setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388611));
        CheckableImageButton checkableImageButton = (CheckableImageButton) LayoutInflater.from(getContext()).inflate(R.layout.design_text_input_start_icon, (ViewGroup) this, false);
        this.startIconView = checkableImageButton;
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        this.prefixTextView = appCompatTextView;
        initStartIconView(y0Var);
        initPrefixTextView(y0Var);
        addView(checkableImageButton);
        addView(appCompatTextView);
    }

    private void initPrefixTextView(y0 y0Var) {
        this.prefixTextView.setVisibility(8);
        this.prefixTextView.setId(R.id.textinput_prefix_text);
        this.prefixTextView.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
        TextView textView = this.prefixTextView;
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.g.f(textView, 1);
        setPrefixTextAppearance(y0Var.m(R.styleable.TextInputLayout_prefixTextAppearance, 0));
        int i10 = R.styleable.TextInputLayout_prefixTextColor;
        if (y0Var.p(i10)) {
            setPrefixTextColor(y0Var.c(i10));
        }
        setPrefixText(y0Var.o(R.styleable.TextInputLayout_prefixText));
    }

    private void initStartIconView(y0 y0Var) {
        if (MaterialResources.isFontScaleAtLeast1_3(getContext())) {
            h.g((ViewGroup.MarginLayoutParams) this.startIconView.getLayoutParams(), 0);
        }
        setStartIconOnClickListener(null);
        setStartIconOnLongClickListener(null);
        int i10 = R.styleable.TextInputLayout_startIconTint;
        if (y0Var.p(i10)) {
            this.startIconTintList = MaterialResources.getColorStateList(getContext(), y0Var, i10);
        }
        int i11 = R.styleable.TextInputLayout_startIconTintMode;
        if (y0Var.p(i11)) {
            this.startIconTintMode = ViewUtils.parseTintMode(y0Var.j(i11, -1), null);
        }
        int i12 = R.styleable.TextInputLayout_startIconDrawable;
        if (y0Var.p(i12)) {
            setStartIconDrawable(y0Var.g(i12));
            int i13 = R.styleable.TextInputLayout_startIconContentDescription;
            if (y0Var.p(i13)) {
                setStartIconContentDescription(y0Var.o(i13));
            }
            setStartIconCheckable(y0Var.a(R.styleable.TextInputLayout_startIconCheckable, true));
        }
    }

    private void updateVisibility() {
        int i10 = (this.prefixText == null || this.hintExpanded) ? 8 : 0;
        setVisibility(this.startIconView.getVisibility() == 0 || i10 == 0 ? 0 : 8);
        this.prefixTextView.setVisibility(i10);
        this.textInputLayout.updateDummyDrawables();
    }

    public CharSequence getPrefixText() {
        return this.prefixText;
    }

    public ColorStateList getPrefixTextColor() {
        return this.prefixTextView.getTextColors();
    }

    public TextView getPrefixTextView() {
        return this.prefixTextView;
    }

    public CharSequence getStartIconContentDescription() {
        return this.startIconView.getContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.startIconView.getDrawable();
    }

    public boolean isStartIconCheckable() {
        return this.startIconView.isCheckable();
    }

    public boolean isStartIconVisible() {
        return this.startIconView.getVisibility() == 0;
    }

    public void onHintStateChanged(boolean z10) {
        this.hintExpanded = z10;
        updateVisibility();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        updatePrefixTextViewPadding();
    }

    public void refreshStartIconDrawableState() {
        IconHelper.refreshIconDrawableState(this.textInputLayout, this.startIconView, this.startIconTintList);
    }

    public void setPrefixText(CharSequence charSequence) {
        this.prefixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.prefixTextView.setText(charSequence);
        updateVisibility();
    }

    public void setPrefixTextAppearance(int i10) {
        this.prefixTextView.setTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.prefixTextView.setTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.startIconView.setCheckable(z10);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        if (getStartIconContentDescription() != charSequence) {
            this.startIconView.setContentDescription(charSequence);
        }
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, this.startIconTintMode);
            setStartIconVisible(true);
            refreshStartIconDrawableState();
        } else {
            setStartIconVisible(false);
            setStartIconOnClickListener(null);
            setStartIconOnLongClickListener(null);
            setStartIconContentDescription(null);
        }
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        IconHelper.setIconOnClickListener(this.startIconView, onClickListener, this.startIconOnLongClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startIconOnLongClickListener = onLongClickListener;
        IconHelper.setIconOnLongClickListener(this.startIconView, onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        if (this.startIconTintList != colorStateList) {
            this.startIconTintList = colorStateList;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, colorStateList, this.startIconTintMode);
        }
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        if (this.startIconTintMode != mode) {
            this.startIconTintMode = mode;
            IconHelper.applyIconTint(this.textInputLayout, this.startIconView, this.startIconTintList, mode);
        }
    }

    public void setStartIconVisible(boolean z10) {
        if (isStartIconVisible() != z10) {
            this.startIconView.setVisibility(z10 ? 0 : 8);
            updatePrefixTextViewPadding();
            updateVisibility();
        }
    }

    public void setupAccessibilityNodeInfo(c cVar) {
        View view;
        if (this.prefixTextView.getVisibility() == 0) {
            cVar.f34746a.setLabelFor(this.prefixTextView);
            view = this.prefixTextView;
        } else {
            view = this.startIconView;
        }
        cVar.f34746a.setTraversalAfter(view);
    }

    public void updatePrefixTextViewPadding() {
        int iF;
        EditText editText = this.textInputLayout.editText;
        if (editText == null) {
            return;
        }
        if (isStartIconVisible()) {
            iF = 0;
        } else {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            iF = e0.e.f(editText);
        }
        TextView textView = this.prefixTextView;
        int compoundPaddingTop = editText.getCompoundPaddingTop();
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int compoundPaddingBottom = editText.getCompoundPaddingBottom();
        WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
        e0.e.k(textView, iF, compoundPaddingTop, dimensionPixelSize, compoundPaddingBottom);
    }
}
