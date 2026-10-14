package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.b;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.c0;
import androidx.appcompat.widget.y0;
import androidx.core.widget.j;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.R;
import com.google.android.material.animation.AnimationUtils;
import com.google.android.material.color.MaterialColors;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.internal.CollapsingTextHelper;
import com.google.android.material.internal.DescendantOffsetUtils;
import com.google.android.material.internal.StaticLayoutBuilderCompat;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.internal.ViewUtils;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.theme.overlay.MaterialThemeOverlay;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import p0.a;
import p0.e0;
import p0.h;
import p0.m0;
import q0.c;
import r1.d;
import r1.n;

/* JADX INFO: loaded from: classes2.dex */
public class TextInputLayout extends LinearLayout {
    public static final int BOX_BACKGROUND_FILLED = 1;
    public static final int BOX_BACKGROUND_NONE = 0;
    public static final int BOX_BACKGROUND_OUTLINE = 2;
    private static final int DEF_STYLE_RES = R.style.Widget_Design_TextInputLayout;
    public static final int END_ICON_CLEAR_TEXT = 2;
    public static final int END_ICON_CUSTOM = -1;
    public static final int END_ICON_DROPDOWN_MENU = 3;
    public static final int END_ICON_NONE = 0;
    public static final int END_ICON_PASSWORD_TOGGLE = 1;
    private static final int INVALID_MAX_LENGTH = -1;
    private static final int LABEL_SCALE_ANIMATION_DURATION = 167;
    private static final String LOG_TAG = "TextInputLayout";
    private static final int NO_WIDTH = -1;
    private static final long PLACEHOLDER_FADE_DURATION = 87;
    private static final long PLACEHOLDER_START_DELAY = 67;
    private ValueAnimator animator;
    private boolean areCornerRadiiRtl;
    private MaterialShapeDrawable boxBackground;
    private int boxBackgroundColor;
    private int boxBackgroundMode;
    private int boxCollapsedPaddingTopPx;
    private final int boxLabelCutoutPaddingPx;
    private int boxStrokeColor;
    private int boxStrokeWidthDefaultPx;
    private int boxStrokeWidthFocusedPx;
    private int boxStrokeWidthPx;
    private MaterialShapeDrawable boxUnderlineDefault;
    private MaterialShapeDrawable boxUnderlineFocused;
    public final CollapsingTextHelper collapsingTextHelper;
    public boolean counterEnabled;
    private int counterMaxLength;
    private int counterOverflowTextAppearance;
    private ColorStateList counterOverflowTextColor;
    private boolean counterOverflowed;
    private int counterTextAppearance;
    private ColorStateList counterTextColor;
    private TextView counterView;
    private int defaultFilledBackgroundColor;
    private ColorStateList defaultHintTextColor;
    private int defaultStrokeColor;
    private int disabledColor;
    private int disabledFilledBackgroundColor;
    public EditText editText;
    private final LinkedHashSet<OnEditTextAttachedListener> editTextAttachedListeners;
    private Drawable endDummyDrawable;
    private int endDummyDrawableWidth;
    private final LinkedHashSet<OnEndIconChangedListener> endIconChangedListeners;
    private final SparseArray<EndIconDelegate> endIconDelegates;
    private final FrameLayout endIconFrame;
    private int endIconMode;
    private View.OnLongClickListener endIconOnLongClickListener;
    private ColorStateList endIconTintList;
    private PorterDuff.Mode endIconTintMode;
    private final CheckableImageButton endIconView;
    private final LinearLayout endLayout;
    private View.OnLongClickListener errorIconOnLongClickListener;
    private ColorStateList errorIconTintList;
    private PorterDuff.Mode errorIconTintMode;
    private final CheckableImageButton errorIconView;
    private boolean expandedHintEnabled;
    private int focusedFilledBackgroundColor;
    private int focusedStrokeColor;
    private ColorStateList focusedTextColor;
    private CharSequence hint;
    private boolean hintAnimationEnabled;
    private boolean hintEnabled;
    private boolean hintExpanded;
    private int hoveredFilledBackgroundColor;
    private int hoveredStrokeColor;
    private boolean inDrawableStateChanged;
    private final IndicatorViewController indicatorViewController;
    private final FrameLayout inputFrame;
    private boolean isProvidingHint;
    private int maxEms;
    private int maxWidth;
    private int minEms;
    private int minWidth;
    private Drawable originalEditTextEndDrawable;
    private CharSequence originalHint;
    private boolean placeholderEnabled;
    private d placeholderFadeIn;
    private d placeholderFadeOut;
    private CharSequence placeholderText;
    private int placeholderTextAppearance;
    private ColorStateList placeholderTextColor;
    private TextView placeholderTextView;
    private boolean restoringSavedState;
    private ShapeAppearanceModel shapeAppearanceModel;
    private Drawable startDummyDrawable;
    private int startDummyDrawableWidth;
    private final StartCompoundLayout startLayout;
    private ColorStateList strokeErrorColor;
    private CharSequence suffixText;
    private final TextView suffixTextView;
    private final Rect tmpBoundsRect;
    private final Rect tmpRect;
    private final RectF tmpRectF;
    private Typeface typeface;

    public static class AccessibilityDelegate extends a {
        private final TextInputLayout layout;

        public AccessibilityDelegate(TextInputLayout textInputLayout) {
            this.layout = textInputLayout;
        }

        @Override // p0.a
        public void onInitializeAccessibilityNodeInfo(View view, c cVar) {
            super.onInitializeAccessibilityNodeInfo(view, cVar);
            EditText editText = this.layout.getEditText();
            Editable text = editText != null ? editText.getText() : null;
            CharSequence hint = this.layout.getHint();
            CharSequence error = this.layout.getError();
            CharSequence placeholderText = this.layout.getPlaceholderText();
            int counterMaxLength = this.layout.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.layout.getCounterOverflowDescription();
            boolean z10 = !TextUtils.isEmpty(text);
            boolean z11 = !TextUtils.isEmpty(hint);
            boolean z12 = !this.layout.isHintExpanded();
            boolean z13 = !TextUtils.isEmpty(error);
            boolean z14 = z13 || !TextUtils.isEmpty(counterOverflowDescription);
            String string = z11 ? hint.toString() : "";
            this.layout.startLayout.setupAccessibilityNodeInfo(cVar);
            if (z10) {
                cVar.f34746a.setText(text);
            } else if (!TextUtils.isEmpty(string)) {
                cVar.f34746a.setText(string);
                if (z12 && placeholderText != null) {
                    placeholderText = string + ", " + ((Object) placeholderText);
                    cVar.f34746a.setText(placeholderText);
                }
            } else if (placeholderText != null) {
                cVar.f34746a.setText(placeholderText);
            }
            if (!TextUtils.isEmpty(string)) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 26) {
                    cVar.o(string);
                } else {
                    if (z10) {
                        string = ((Object) text) + ", " + string;
                    }
                    cVar.f34746a.setText(string);
                }
                boolean z15 = !z10;
                if (i10 >= 26) {
                    cVar.f34746a.setShowingHintText(z15);
                } else {
                    cVar.l(4, z15);
                }
            }
            if (text == null || text.length() != counterMaxLength) {
                counterMaxLength = -1;
            }
            cVar.f34746a.setMaxTextLength(counterMaxLength);
            if (z14) {
                if (!z13) {
                    error = counterOverflowDescription;
                }
                cVar.f34746a.setError(error);
            }
            View helperTextView = this.layout.indicatorViewController.getHelperTextView();
            if (helperTextView != null) {
                cVar.f34746a.setLabelFor(helperTextView);
            }
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface BoxBackgroundMode {
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface EndIconMode {
    }

    public interface OnEditTextAttachedListener {
        void onEditTextAttached(TextInputLayout textInputLayout);
    }

    public interface OnEndIconChangedListener {
        void onEndIconChanged(TextInputLayout textInputLayout, int i10);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() { // from class: com.google.android.material.textfield.TextInputLayout.SavedState.1
            @Override // android.os.Parcelable.Creator
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.ClassLoaderCreator
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        };
        public CharSequence error;
        public CharSequence helperText;
        public CharSequence hintText;
        public boolean isEndIconChecked;
        public CharSequence placeholderText;

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.error = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.isEndIconChecked = parcel.readInt() == 1;
            this.hintText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.helperText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.placeholderText = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            StringBuilder sbA = defpackage.a.a("TextInputLayout.SavedState{");
            sbA.append(Integer.toHexString(System.identityHashCode(this)));
            sbA.append(" error=");
            sbA.append((Object) this.error);
            sbA.append(" hint=");
            sbA.append((Object) this.hintText);
            sbA.append(" helperText=");
            sbA.append((Object) this.helperText);
            sbA.append(" placeholderText=");
            sbA.append((Object) this.placeholderText);
            sbA.append("}");
            return sbA.toString();
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            TextUtils.writeToParcel(this.error, parcel, i10);
            parcel.writeInt(this.isEndIconChecked ? 1 : 0);
            TextUtils.writeToParcel(this.hintText, parcel, i10);
            TextUtils.writeToParcel(this.helperText, parcel, i10);
            TextUtils.writeToParcel(this.placeholderText, parcel, i10);
        }
    }

    public TextInputLayout(Context context) {
        this(context, null);
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textInputStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v110 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50, types: [boolean, int] */
    public TextInputLayout(Context context, AttributeSet attributeSet, int i10) {
        int i11;
        ?? r10;
        int colorForState;
        int i12 = DEF_STYLE_RES;
        super(MaterialThemeOverlay.wrap(context, attributeSet, i10, i12), attributeSet, i10);
        this.minEms = -1;
        this.maxEms = -1;
        this.minWidth = -1;
        this.maxWidth = -1;
        this.indicatorViewController = new IndicatorViewController(this);
        this.tmpRect = new Rect();
        this.tmpBoundsRect = new Rect();
        this.tmpRectF = new RectF();
        this.editTextAttachedListeners = new LinkedHashSet<>();
        this.endIconMode = 0;
        SparseArray<EndIconDelegate> sparseArray = new SparseArray<>();
        this.endIconDelegates = sparseArray;
        this.endIconChangedListeners = new LinkedHashSet<>();
        CollapsingTextHelper collapsingTextHelper = new CollapsingTextHelper(this);
        this.collapsingTextHelper = collapsingTextHelper;
        Context context2 = getContext();
        setOrientation(1);
        setWillNotDraw(false);
        setAddStatesFromChildren(true);
        FrameLayout frameLayout = new FrameLayout(context2);
        this.inputFrame = frameLayout;
        FrameLayout frameLayout2 = new FrameLayout(context2);
        this.endIconFrame = frameLayout2;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.endLayout = linearLayout;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context2);
        this.suffixTextView = appCompatTextView;
        linearLayout.setVisibility(8);
        frameLayout2.setVisibility(8);
        appCompatTextView.setVisibility(8);
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(context2);
        int i13 = R.layout.design_text_input_end_icon;
        CheckableImageButton checkableImageButton = (CheckableImageButton) layoutInflaterFrom.inflate(i13, (ViewGroup) linearLayout, false);
        this.errorIconView = checkableImageButton;
        CheckableImageButton checkableImageButton2 = (CheckableImageButton) layoutInflaterFrom.inflate(i13, (ViewGroup) frameLayout2, false);
        this.endIconView = checkableImageButton2;
        frameLayout.setAddStatesFromChildren(true);
        linearLayout.setOrientation(0);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -1, 8388613));
        frameLayout2.setLayoutParams(new FrameLayout.LayoutParams(-2, -1));
        TimeInterpolator timeInterpolator = AnimationUtils.LINEAR_INTERPOLATOR;
        collapsingTextHelper.setTextSizeInterpolator(timeInterpolator);
        collapsingTextHelper.setPositionInterpolator(timeInterpolator);
        collapsingTextHelper.setCollapsedTextGravity(8388659);
        int[] iArr = R.styleable.TextInputLayout;
        int i14 = R.styleable.TextInputLayout_counterTextAppearance;
        int i15 = R.styleable.TextInputLayout_counterOverflowTextAppearance;
        int i16 = R.styleable.TextInputLayout_errorTextAppearance;
        int i17 = R.styleable.TextInputLayout_helperTextTextAppearance;
        int i18 = R.styleable.TextInputLayout_hintTextAppearance;
        y0 y0VarObtainTintedStyledAttributes = ThemeEnforcement.obtainTintedStyledAttributes(context2, attributeSet, iArr, i10, i12, i14, i15, i16, i17, i18);
        StartCompoundLayout startCompoundLayout = new StartCompoundLayout(this, y0VarObtainTintedStyledAttributes);
        this.startLayout = startCompoundLayout;
        this.hintEnabled = y0VarObtainTintedStyledAttributes.a(R.styleable.TextInputLayout_hintEnabled, true);
        setHint(y0VarObtainTintedStyledAttributes.o(R.styleable.TextInputLayout_android_hint));
        this.hintAnimationEnabled = y0VarObtainTintedStyledAttributes.a(R.styleable.TextInputLayout_hintAnimationEnabled, true);
        this.expandedHintEnabled = y0VarObtainTintedStyledAttributes.a(R.styleable.TextInputLayout_expandedHintEnabled, true);
        int i19 = R.styleable.TextInputLayout_android_minEms;
        if (y0VarObtainTintedStyledAttributes.p(i19)) {
            i11 = -1;
            setMinEms(y0VarObtainTintedStyledAttributes.j(i19, -1));
        } else {
            i11 = -1;
            int i20 = R.styleable.TextInputLayout_android_minWidth;
            if (y0VarObtainTintedStyledAttributes.p(i20)) {
                setMinWidth(y0VarObtainTintedStyledAttributes.f(i20, -1));
            }
        }
        int i21 = R.styleable.TextInputLayout_android_maxEms;
        if (y0VarObtainTintedStyledAttributes.p(i21)) {
            setMaxEms(y0VarObtainTintedStyledAttributes.j(i21, i11));
        } else {
            int i22 = R.styleable.TextInputLayout_android_maxWidth;
            if (y0VarObtainTintedStyledAttributes.p(i22)) {
                setMaxWidth(y0VarObtainTintedStyledAttributes.f(i22, i11));
            }
        }
        this.shapeAppearanceModel = ShapeAppearanceModel.builder(context2, attributeSet, i10, i12).build();
        this.boxLabelCutoutPaddingPx = context2.getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_box_label_cutout_padding);
        this.boxCollapsedPaddingTopPx = y0VarObtainTintedStyledAttributes.e(R.styleable.TextInputLayout_boxCollapsedPaddingTop, 0);
        this.boxStrokeWidthDefaultPx = y0VarObtainTintedStyledAttributes.f(R.styleable.TextInputLayout_boxStrokeWidth, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_default));
        this.boxStrokeWidthFocusedPx = y0VarObtainTintedStyledAttributes.f(R.styleable.TextInputLayout_boxStrokeWidthFocused, context2.getResources().getDimensionPixelSize(R.dimen.mtrl_textinput_box_stroke_width_focused));
        this.boxStrokeWidthPx = this.boxStrokeWidthDefaultPx;
        float fD = y0VarObtainTintedStyledAttributes.d(R.styleable.TextInputLayout_boxCornerRadiusTopStart, -1.0f);
        float fD2 = y0VarObtainTintedStyledAttributes.d(R.styleable.TextInputLayout_boxCornerRadiusTopEnd, -1.0f);
        float fD3 = y0VarObtainTintedStyledAttributes.d(R.styleable.TextInputLayout_boxCornerRadiusBottomEnd, -1.0f);
        float fD4 = y0VarObtainTintedStyledAttributes.d(R.styleable.TextInputLayout_boxCornerRadiusBottomStart, -1.0f);
        ShapeAppearanceModel.Builder builder = this.shapeAppearanceModel.toBuilder();
        if (fD >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            builder.setTopLeftCornerSize(fD);
        }
        if (fD2 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            builder.setTopRightCornerSize(fD2);
        }
        if (fD3 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            builder.setBottomRightCornerSize(fD3);
        }
        if (fD4 >= StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD) {
            builder.setBottomLeftCornerSize(fD4);
        }
        this.shapeAppearanceModel = builder.build();
        ColorStateList colorStateList = MaterialResources.getColorStateList(context2, y0VarObtainTintedStyledAttributes, R.styleable.TextInputLayout_boxBackgroundColor);
        if (colorStateList != null) {
            int defaultColor = colorStateList.getDefaultColor();
            this.defaultFilledBackgroundColor = defaultColor;
            this.boxBackgroundColor = defaultColor;
            if (colorStateList.isStateful()) {
                this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
                this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
                colorForState = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            } else {
                this.focusedFilledBackgroundColor = this.defaultFilledBackgroundColor;
                ColorStateList colorStateListA = e.a.a(context2, R.color.mtrl_filled_background_color);
                this.disabledFilledBackgroundColor = colorStateListA.getColorForState(new int[]{-16842910}, -1);
                colorForState = colorStateListA.getColorForState(new int[]{android.R.attr.state_hovered}, -1);
            }
            this.hoveredFilledBackgroundColor = colorForState;
        } else {
            this.boxBackgroundColor = 0;
            this.defaultFilledBackgroundColor = 0;
            this.disabledFilledBackgroundColor = 0;
            this.focusedFilledBackgroundColor = 0;
            this.hoveredFilledBackgroundColor = 0;
        }
        int i23 = R.styleable.TextInputLayout_android_textColorHint;
        if (y0VarObtainTintedStyledAttributes.p(i23)) {
            ColorStateList colorStateListC = y0VarObtainTintedStyledAttributes.c(i23);
            this.focusedTextColor = colorStateListC;
            this.defaultHintTextColor = colorStateListC;
        }
        int i24 = R.styleable.TextInputLayout_boxStrokeColor;
        ColorStateList colorStateList2 = MaterialResources.getColorStateList(context2, y0VarObtainTintedStyledAttributes, i24);
        this.focusedStrokeColor = y0VarObtainTintedStyledAttributes.b(i24, 0);
        int i25 = R.color.mtrl_textinput_default_box_stroke_color;
        Object obj = e0.a.f28964a;
        this.defaultStrokeColor = e0.a.d.a(context2, i25);
        this.disabledColor = e0.a.d.a(context2, R.color.mtrl_textinput_disabled_color);
        this.hoveredStrokeColor = e0.a.d.a(context2, R.color.mtrl_textinput_hovered_box_stroke_color);
        if (colorStateList2 != null) {
            setBoxStrokeColorStateList(colorStateList2);
        }
        int i26 = R.styleable.TextInputLayout_boxStrokeErrorColor;
        if (y0VarObtainTintedStyledAttributes.p(i26)) {
            setBoxStrokeErrorColor(MaterialResources.getColorStateList(context2, y0VarObtainTintedStyledAttributes, i26));
        }
        if (y0VarObtainTintedStyledAttributes.m(i18, -1) != -1) {
            r10 = 0;
            setHintTextAppearance(y0VarObtainTintedStyledAttributes.m(i18, 0));
        } else {
            r10 = 0;
        }
        int iM = y0VarObtainTintedStyledAttributes.m(i16, r10);
        CharSequence charSequenceO = y0VarObtainTintedStyledAttributes.o(R.styleable.TextInputLayout_errorContentDescription);
        boolean zA = y0VarObtainTintedStyledAttributes.a(R.styleable.TextInputLayout_errorEnabled, r10);
        checkableImageButton.setId(R.id.text_input_error_icon);
        if (MaterialResources.isFontScaleAtLeast1_3(context2)) {
            h.h((ViewGroup.MarginLayoutParams) checkableImageButton.getLayoutParams(), r10);
        }
        int i27 = R.styleable.TextInputLayout_errorIconTint;
        if (y0VarObtainTintedStyledAttributes.p(i27)) {
            this.errorIconTintList = MaterialResources.getColorStateList(context2, y0VarObtainTintedStyledAttributes, i27);
        }
        int i28 = R.styleable.TextInputLayout_errorIconTintMode;
        if (y0VarObtainTintedStyledAttributes.p(i28)) {
            this.errorIconTintMode = ViewUtils.parseTintMode(y0VarObtainTintedStyledAttributes.j(i28, -1), null);
        }
        int i29 = R.styleable.TextInputLayout_errorIconDrawable;
        if (y0VarObtainTintedStyledAttributes.p(i29)) {
            setErrorIconDrawable(y0VarObtainTintedStyledAttributes.g(i29));
        }
        checkableImageButton.setContentDescription(getResources().getText(R.string.error_icon_content_description));
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        e0.d.s(checkableImageButton, 2);
        checkableImageButton.setClickable(false);
        checkableImageButton.setPressable(false);
        checkableImageButton.setFocusable(false);
        int iM2 = y0VarObtainTintedStyledAttributes.m(i17, 0);
        boolean zA2 = y0VarObtainTintedStyledAttributes.a(R.styleable.TextInputLayout_helperTextEnabled, false);
        CharSequence charSequenceO2 = y0VarObtainTintedStyledAttributes.o(R.styleable.TextInputLayout_helperText);
        int iM3 = y0VarObtainTintedStyledAttributes.m(R.styleable.TextInputLayout_placeholderTextAppearance, 0);
        CharSequence charSequenceO3 = y0VarObtainTintedStyledAttributes.o(R.styleable.TextInputLayout_placeholderText);
        int iM4 = y0VarObtainTintedStyledAttributes.m(R.styleable.TextInputLayout_suffixTextAppearance, 0);
        CharSequence charSequenceO4 = y0VarObtainTintedStyledAttributes.o(R.styleable.TextInputLayout_suffixText);
        boolean zA3 = y0VarObtainTintedStyledAttributes.a(R.styleable.TextInputLayout_counterEnabled, false);
        setCounterMaxLength(y0VarObtainTintedStyledAttributes.j(R.styleable.TextInputLayout_counterMaxLength, -1));
        this.counterTextAppearance = y0VarObtainTintedStyledAttributes.m(i14, 0);
        this.counterOverflowTextAppearance = y0VarObtainTintedStyledAttributes.m(i15, 0);
        setBoxBackgroundMode(y0VarObtainTintedStyledAttributes.j(R.styleable.TextInputLayout_boxBackgroundMode, 0));
        if (MaterialResources.isFontScaleAtLeast1_3(context2)) {
            h.h((ViewGroup.MarginLayoutParams) checkableImageButton2.getLayoutParams(), 0);
        }
        int iM5 = y0VarObtainTintedStyledAttributes.m(R.styleable.TextInputLayout_endIconDrawable, 0);
        sparseArray.append(-1, new CustomEndIconDelegate(this, iM5));
        sparseArray.append(0, new NoEndIconDelegate(this));
        sparseArray.append(1, new PasswordToggleEndIconDelegate(this, iM5 == 0 ? y0VarObtainTintedStyledAttributes.m(R.styleable.TextInputLayout_passwordToggleDrawable, 0) : iM5));
        sparseArray.append(2, new ClearTextEndIconDelegate(this, iM5));
        sparseArray.append(3, new DropdownMenuEndIconDelegate(this, iM5));
        int i30 = R.styleable.TextInputLayout_passwordToggleEnabled;
        if (!y0VarObtainTintedStyledAttributes.p(i30)) {
            int i31 = R.styleable.TextInputLayout_endIconTint;
            if (y0VarObtainTintedStyledAttributes.p(i31)) {
                this.endIconTintList = MaterialResources.getColorStateList(context2, y0VarObtainTintedStyledAttributes, i31);
            }
            int i32 = R.styleable.TextInputLayout_endIconTintMode;
            if (y0VarObtainTintedStyledAttributes.p(i32)) {
                this.endIconTintMode = ViewUtils.parseTintMode(y0VarObtainTintedStyledAttributes.j(i32, -1), null);
            }
        }
        int i33 = R.styleable.TextInputLayout_endIconMode;
        if (y0VarObtainTintedStyledAttributes.p(i33)) {
            setEndIconMode(y0VarObtainTintedStyledAttributes.j(i33, 0));
            int i34 = R.styleable.TextInputLayout_endIconContentDescription;
            if (y0VarObtainTintedStyledAttributes.p(i34)) {
                setEndIconContentDescription(y0VarObtainTintedStyledAttributes.o(i34));
            }
            setEndIconCheckable(y0VarObtainTintedStyledAttributes.a(R.styleable.TextInputLayout_endIconCheckable, true));
        } else if (y0VarObtainTintedStyledAttributes.p(i30)) {
            int i35 = R.styleable.TextInputLayout_passwordToggleTint;
            if (y0VarObtainTintedStyledAttributes.p(i35)) {
                this.endIconTintList = MaterialResources.getColorStateList(context2, y0VarObtainTintedStyledAttributes, i35);
            }
            int i36 = R.styleable.TextInputLayout_passwordToggleTintMode;
            if (y0VarObtainTintedStyledAttributes.p(i36)) {
                this.endIconTintMode = ViewUtils.parseTintMode(y0VarObtainTintedStyledAttributes.j(i36, -1), null);
            }
            setEndIconMode(y0VarObtainTintedStyledAttributes.a(i30, false) ? 1 : 0);
            setEndIconContentDescription(y0VarObtainTintedStyledAttributes.o(R.styleable.TextInputLayout_passwordToggleContentDescription));
        }
        appCompatTextView.setId(R.id.textinput_suffix_text);
        appCompatTextView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2, 80));
        e0.g.f(appCompatTextView, 1);
        setErrorContentDescription(charSequenceO);
        setCounterOverflowTextAppearance(this.counterOverflowTextAppearance);
        setHelperTextTextAppearance(iM2);
        setErrorTextAppearance(iM);
        setCounterTextAppearance(this.counterTextAppearance);
        setPlaceholderText(charSequenceO3);
        setPlaceholderTextAppearance(iM3);
        setSuffixTextAppearance(iM4);
        int i37 = R.styleable.TextInputLayout_errorTextColor;
        if (y0VarObtainTintedStyledAttributes.p(i37)) {
            setErrorTextColor(y0VarObtainTintedStyledAttributes.c(i37));
        }
        int i38 = R.styleable.TextInputLayout_helperTextTextColor;
        if (y0VarObtainTintedStyledAttributes.p(i38)) {
            setHelperTextColor(y0VarObtainTintedStyledAttributes.c(i38));
        }
        int i39 = R.styleable.TextInputLayout_hintTextColor;
        if (y0VarObtainTintedStyledAttributes.p(i39)) {
            setHintTextColor(y0VarObtainTintedStyledAttributes.c(i39));
        }
        int i40 = R.styleable.TextInputLayout_counterTextColor;
        if (y0VarObtainTintedStyledAttributes.p(i40)) {
            setCounterTextColor(y0VarObtainTintedStyledAttributes.c(i40));
        }
        int i41 = R.styleable.TextInputLayout_counterOverflowTextColor;
        if (y0VarObtainTintedStyledAttributes.p(i41)) {
            setCounterOverflowTextColor(y0VarObtainTintedStyledAttributes.c(i41));
        }
        int i42 = R.styleable.TextInputLayout_placeholderTextColor;
        if (y0VarObtainTintedStyledAttributes.p(i42)) {
            setPlaceholderTextColor(y0VarObtainTintedStyledAttributes.c(i42));
        }
        int i43 = R.styleable.TextInputLayout_suffixTextColor;
        if (y0VarObtainTintedStyledAttributes.p(i43)) {
            setSuffixTextColor(y0VarObtainTintedStyledAttributes.c(i43));
        }
        setEnabled(y0VarObtainTintedStyledAttributes.a(R.styleable.TextInputLayout_android_enabled, true));
        y0VarObtainTintedStyledAttributes.f1412b.recycle();
        e0.d.s(this, 2);
        int i44 = Build.VERSION.SDK_INT;
        if (i44 >= 26 && i44 >= 26) {
            e0.l.l(this, 1);
        }
        frameLayout2.addView(checkableImageButton2);
        linearLayout.addView(appCompatTextView);
        linearLayout.addView(checkableImageButton);
        linearLayout.addView(frameLayout2);
        frameLayout.addView(startCompoundLayout);
        frameLayout.addView(linearLayout);
        addView(frameLayout);
        setHelperTextEnabled(zA2);
        setErrorEnabled(zA);
        setCounterEnabled(zA3);
        setHelperText(charSequenceO2);
        setSuffixText(charSequenceO4);
    }

    private void addPlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            this.inputFrame.addView(textView);
            this.placeholderTextView.setVisibility(0);
        }
    }

    private void adjustFilledEditTextPaddingForLargeFont() {
        EditText editText;
        int iF;
        int dimensionPixelSize;
        int iE;
        Resources resources;
        int i10;
        if (this.editText == null || this.boxBackgroundMode != 1) {
            return;
        }
        if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
            editText = this.editText;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            iF = e0.e.f(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_2_0_padding_top);
            iE = e0.e.e(this.editText);
            resources = getResources();
            i10 = R.dimen.material_filled_edittext_font_2_0_padding_bottom;
        } else {
            if (!MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                return;
            }
            editText = this.editText;
            WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
            iF = e0.e.f(editText);
            dimensionPixelSize = getResources().getDimensionPixelSize(R.dimen.material_filled_edittext_font_1_3_padding_top);
            iE = e0.e.e(this.editText);
            resources = getResources();
            i10 = R.dimen.material_filled_edittext_font_1_3_padding_bottom;
        }
        e0.e.k(editText, iF, dimensionPixelSize, iE, resources.getDimensionPixelSize(i10));
    }

    private void applyBoxAttributes() {
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable == null) {
            return;
        }
        ShapeAppearanceModel shapeAppearanceModel = materialShapeDrawable.getShapeAppearanceModel();
        ShapeAppearanceModel shapeAppearanceModel2 = this.shapeAppearanceModel;
        if (shapeAppearanceModel != shapeAppearanceModel2) {
            this.boxBackground.setShapeAppearanceModel(shapeAppearanceModel2);
            updateDropdownMenuBackground();
        }
        if (canDrawOutlineStroke()) {
            this.boxBackground.setStroke(this.boxStrokeWidthPx, this.boxStrokeColor);
        }
        int iCalculateBoxBackgroundColor = calculateBoxBackgroundColor();
        this.boxBackgroundColor = iCalculateBoxBackgroundColor;
        this.boxBackground.setFillColor(ColorStateList.valueOf(iCalculateBoxBackgroundColor));
        if (this.endIconMode == 3) {
            this.editText.getBackground().invalidateSelf();
        }
        applyBoxUnderlineAttributes();
        invalidate();
    }

    private void applyBoxUnderlineAttributes() {
        if (this.boxUnderlineDefault == null || this.boxUnderlineFocused == null) {
            return;
        }
        if (canDrawStroke()) {
            this.boxUnderlineDefault.setFillColor(ColorStateList.valueOf(this.editText.isFocused() ? this.defaultStrokeColor : this.boxStrokeColor));
            this.boxUnderlineFocused.setFillColor(ColorStateList.valueOf(this.boxStrokeColor));
        }
        invalidate();
    }

    private void applyCutoutPadding(RectF rectF) {
        float f10 = rectF.left;
        int i10 = this.boxLabelCutoutPaddingPx;
        rectF.left = f10 - i10;
        rectF.right += i10;
    }

    private void assignBoxBackgroundByMode() {
        int i10 = this.boxBackgroundMode;
        if (i10 == 0) {
            this.boxBackground = null;
        } else if (i10 == 1) {
            this.boxBackground = new MaterialShapeDrawable(this.shapeAppearanceModel);
            this.boxUnderlineDefault = new MaterialShapeDrawable();
            this.boxUnderlineFocused = new MaterialShapeDrawable();
            return;
        } else {
            if (i10 != 2) {
                throw new IllegalArgumentException(b.a(new StringBuilder(), this.boxBackgroundMode, " is illegal; only @BoxBackgroundMode constants are supported."));
            }
            this.boxBackground = (!this.hintEnabled || (this.boxBackground instanceof CutoutDrawable)) ? new MaterialShapeDrawable(this.shapeAppearanceModel) : new CutoutDrawable(this.shapeAppearanceModel);
        }
        this.boxUnderlineDefault = null;
        this.boxUnderlineFocused = null;
    }

    private int calculateBoxBackgroundColor() {
        return this.boxBackgroundMode == 1 ? MaterialColors.layer(MaterialColors.getColor(this, R.attr.colorSurface, 0), this.boxBackgroundColor) : this.boxBackgroundColor;
    }

    private Rect calculateCollapsedTextBounds(Rect rect) {
        int paddingTop;
        int labelRightBoundAlignedWithSuffix;
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        rect2.bottom = rect.bottom;
        int i10 = this.boxBackgroundMode;
        if (i10 != 1) {
            if (i10 != 2) {
                rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, zIsLayoutRtl);
                paddingTop = getPaddingTop();
            } else {
                rect2.left = this.editText.getPaddingLeft() + rect.left;
                rect2.top = rect.top - calculateLabelMarginTop();
                labelRightBoundAlignedWithSuffix = rect.right - this.editText.getPaddingRight();
            }
            rect2.right = labelRightBoundAlignedWithSuffix;
            return rect2;
        }
        rect2.left = getLabelLeftBoundAlightWithPrefix(rect.left, zIsLayoutRtl);
        paddingTop = rect.top + this.boxCollapsedPaddingTopPx;
        rect2.top = paddingTop;
        labelRightBoundAlignedWithSuffix = getLabelRightBoundAlignedWithSuffix(rect.right, zIsLayoutRtl);
        rect2.right = labelRightBoundAlignedWithSuffix;
        return rect2;
    }

    private int calculateExpandedLabelBottom(Rect rect, Rect rect2, float f10) {
        return isSingleLineFilledTextField() ? (int) (rect2.top + f10) : rect.bottom - this.editText.getCompoundPaddingBottom();
    }

    private int calculateExpandedLabelTop(Rect rect, float f10) {
        if (isSingleLineFilledTextField()) {
            return (int) (rect.centerY() - (f10 / 2.0f));
        }
        return this.editText.getCompoundPaddingTop() + rect.top;
    }

    private Rect calculateExpandedTextBounds(Rect rect) {
        if (this.editText == null) {
            throw new IllegalStateException();
        }
        Rect rect2 = this.tmpBoundsRect;
        float expandedTextHeight = this.collapsingTextHelper.getExpandedTextHeight();
        rect2.left = this.editText.getCompoundPaddingLeft() + rect.left;
        rect2.top = calculateExpandedLabelTop(rect, expandedTextHeight);
        rect2.right = rect.right - this.editText.getCompoundPaddingRight();
        rect2.bottom = calculateExpandedLabelBottom(rect, rect2, expandedTextHeight);
        return rect2;
    }

    private int calculateLabelMarginTop() {
        float collapsedTextHeight;
        if (!this.hintEnabled) {
            return 0;
        }
        int i10 = this.boxBackgroundMode;
        if (i10 == 0) {
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight();
        } else {
            if (i10 != 2) {
                return 0;
            }
            collapsedTextHeight = this.collapsingTextHelper.getCollapsedTextHeight() / 2.0f;
        }
        return (int) collapsedTextHeight;
    }

    private boolean canDrawOutlineStroke() {
        return this.boxBackgroundMode == 2 && canDrawStroke();
    }

    private boolean canDrawStroke() {
        return this.boxStrokeWidthPx > -1 && this.boxStrokeColor != 0;
    }

    private void closeCutout() {
        if (cutoutEnabled()) {
            ((CutoutDrawable) this.boxBackground).removeCutout();
        }
    }

    private void collapseHint(boolean z10) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z10 && this.hintAnimationEnabled) {
            animateToExpansionFraction(1.0f);
        } else {
            this.collapsingTextHelper.setExpansionFraction(1.0f);
        }
        this.hintExpanded = false;
        if (cutoutEnabled()) {
            openCutout();
        }
        updatePlaceholderText();
        this.startLayout.onHintStateChanged(false);
        updateSuffixTextVisibility();
    }

    private d createPlaceholderFadeTransition() {
        d dVar = new d();
        dVar.setDuration(PLACEHOLDER_FADE_DURATION);
        dVar.setInterpolator(AnimationUtils.LINEAR_INTERPOLATOR);
        return dVar;
    }

    private boolean cutoutEnabled() {
        return this.hintEnabled && !TextUtils.isEmpty(this.hint) && (this.boxBackground instanceof CutoutDrawable);
    }

    private void dispatchOnEditTextAttached() {
        Iterator<OnEditTextAttachedListener> it = this.editTextAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEditTextAttached(this);
        }
    }

    private void dispatchOnEndIconChanged(int i10) {
        Iterator<OnEndIconChangedListener> it = this.endIconChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().onEndIconChanged(this, i10);
        }
    }

    private void drawBoxUnderline(Canvas canvas) {
        MaterialShapeDrawable materialShapeDrawable;
        if (this.boxUnderlineFocused == null || (materialShapeDrawable = this.boxUnderlineDefault) == null) {
            return;
        }
        materialShapeDrawable.draw(canvas);
        if (this.editText.isFocused()) {
            Rect bounds = this.boxUnderlineFocused.getBounds();
            Rect bounds2 = this.boxUnderlineDefault.getBounds();
            float expansionFraction = this.collapsingTextHelper.getExpansionFraction();
            int iCenterX = bounds2.centerX();
            bounds.left = AnimationUtils.lerp(iCenterX, bounds2.left, expansionFraction);
            bounds.right = AnimationUtils.lerp(iCenterX, bounds2.right, expansionFraction);
            this.boxUnderlineFocused.draw(canvas);
        }
    }

    private void drawHint(Canvas canvas) {
        if (this.hintEnabled) {
            this.collapsingTextHelper.draw(canvas);
        }
    }

    private void expandHint(boolean z10) {
        ValueAnimator valueAnimator = this.animator;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.animator.cancel();
        }
        if (z10 && this.hintAnimationEnabled) {
            animateToExpansionFraction(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        } else {
            this.collapsingTextHelper.setExpansionFraction(StaticLayoutBuilderCompat.DEFAULT_LINE_SPACING_ADD);
        }
        if (cutoutEnabled() && ((CutoutDrawable) this.boxBackground).hasCutout()) {
            closeCutout();
        }
        this.hintExpanded = true;
        hidePlaceholderText();
        this.startLayout.onHintStateChanged(true);
        updateSuffixTextVisibility();
    }

    private EndIconDelegate getEndIconDelegate() {
        EndIconDelegate endIconDelegate = this.endIconDelegates.get(this.endIconMode);
        return endIconDelegate != null ? endIconDelegate : this.endIconDelegates.get(0);
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.errorIconView.getVisibility() == 0) {
            return this.errorIconView;
        }
        if (hasEndIcon() && isEndIconVisible()) {
            return this.endIconView;
        }
        return null;
    }

    private int getLabelLeftBoundAlightWithPrefix(int i10, boolean z10) {
        int compoundPaddingLeft = this.editText.getCompoundPaddingLeft() + i10;
        return (getPrefixText() == null || z10) ? compoundPaddingLeft : (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
    }

    private int getLabelRightBoundAlignedWithSuffix(int i10, boolean z10) {
        int compoundPaddingRight = i10 - this.editText.getCompoundPaddingRight();
        return (getPrefixText() == null || !z10) ? compoundPaddingRight : compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
    }

    private boolean hasEndIcon() {
        return this.endIconMode != 0;
    }

    private void hidePlaceholderText() {
        TextView textView = this.placeholderTextView;
        if (textView == null || !this.placeholderEnabled) {
            return;
        }
        textView.setText((CharSequence) null);
        n.a(this.inputFrame, this.placeholderFadeOut);
        this.placeholderTextView.setVisibility(4);
    }

    private boolean isErrorIconVisible() {
        return this.errorIconView.getVisibility() == 0;
    }

    private boolean isSingleLineFilledTextField() {
        return this.boxBackgroundMode == 1 && this.editText.getMinLines() <= 1;
    }

    private void onApplyBoxBackgroundMode() {
        assignBoxBackgroundByMode();
        setEditTextBoxBackground();
        updateTextInputBoxState();
        updateBoxCollapsedPaddingTop();
        adjustFilledEditTextPaddingForLargeFont();
        if (this.boxBackgroundMode != 0) {
            updateInputLayoutMargins();
        }
    }

    private void openCutout() {
        if (cutoutEnabled()) {
            RectF rectF = this.tmpRectF;
            this.collapsingTextHelper.getCollapsedTextActualBounds(rectF, this.editText.getWidth(), this.editText.getGravity());
            applyCutoutPadding(rectF);
            rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.boxStrokeWidthPx);
            ((CutoutDrawable) this.boxBackground).setCutout(rectF);
        }
    }

    private void recalculateCutout() {
        if (!cutoutEnabled() || this.hintExpanded) {
            return;
        }
        closeCutout();
        openCutout();
    }

    private static void recursiveSetEnabled(ViewGroup viewGroup, boolean z10) {
        int childCount = viewGroup.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = viewGroup.getChildAt(i10);
            childAt.setEnabled(z10);
            if (childAt instanceof ViewGroup) {
                recursiveSetEnabled((ViewGroup) childAt, z10);
            }
        }
    }

    private void removePlaceholderTextView() {
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    private void setEditText(EditText editText) {
        if (this.editText != null) {
            throw new IllegalArgumentException("We already have an EditText, can only have one");
        }
        if (this.endIconMode != 3 && !(editText instanceof TextInputEditText)) {
            Log.i(LOG_TAG, "EditText added is not a TextInputEditText. Please switch to using that class instead.");
        }
        this.editText = editText;
        int i10 = this.minEms;
        if (i10 != -1) {
            setMinEms(i10);
        } else {
            setMinWidth(this.minWidth);
        }
        int i11 = this.maxEms;
        if (i11 != -1) {
            setMaxEms(i11);
        } else {
            setMaxWidth(this.maxWidth);
        }
        onApplyBoxBackgroundMode();
        setTextInputAccessibilityDelegate(new AccessibilityDelegate(this));
        this.collapsingTextHelper.setTypefaces(this.editText.getTypeface());
        this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
        this.collapsingTextHelper.setExpandedLetterSpacing(this.editText.getLetterSpacing());
        int gravity = this.editText.getGravity();
        this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
        this.collapsingTextHelper.setExpandedTextGravity(gravity);
        this.editText.addTextChangedListener(new TextWatcher() { // from class: com.google.android.material.textfield.TextInputLayout.1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                TextInputLayout textInputLayout = TextInputLayout.this;
                textInputLayout.updateLabelState(!textInputLayout.restoringSavedState);
                TextInputLayout textInputLayout2 = TextInputLayout.this;
                if (textInputLayout2.counterEnabled) {
                    textInputLayout2.updateCounter(editable.length());
                }
                if (TextInputLayout.this.placeholderEnabled) {
                    TextInputLayout.this.updatePlaceholderText(editable.length());
                }
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            }

            @Override // android.text.TextWatcher
            public void onTextChanged(CharSequence charSequence, int i12, int i13, int i14) {
            }
        });
        if (this.defaultHintTextColor == null) {
            this.defaultHintTextColor = this.editText.getHintTextColors();
        }
        if (this.hintEnabled) {
            if (TextUtils.isEmpty(this.hint)) {
                CharSequence hint = this.editText.getHint();
                this.originalHint = hint;
                setHint(hint);
                this.editText.setHint((CharSequence) null);
            }
            this.isProvidingHint = true;
        }
        if (this.counterView != null) {
            updateCounter(this.editText.getText().length());
        }
        updateEditTextBackground();
        this.indicatorViewController.adjustIndicatorPadding();
        this.startLayout.bringToFront();
        this.endLayout.bringToFront();
        this.endIconFrame.bringToFront();
        this.errorIconView.bringToFront();
        dispatchOnEditTextAttached();
        updateSuffixTextViewPadding();
        if (!isEnabled()) {
            editText.setEnabled(false);
        }
        updateLabelState(false, true);
    }

    private void setEditTextBoxBackground() {
        if (shouldUseEditTextBackgroundForBoxBackground()) {
            EditText editText = this.editText;
            MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.q(editText, materialShapeDrawable);
        }
    }

    private void setHintInternal(CharSequence charSequence) {
        if (TextUtils.equals(charSequence, this.hint)) {
            return;
        }
        this.hint = charSequence;
        this.collapsingTextHelper.setText(charSequence);
        if (this.hintExpanded) {
            return;
        }
        openCutout();
    }

    private static void setIconClickable(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        WeakHashMap<View, m0> weakHashMap = e0.f34354a;
        boolean zA = e0.c.a(checkableImageButton);
        boolean z10 = onLongClickListener != null;
        boolean z11 = zA || z10;
        checkableImageButton.setFocusable(z11);
        checkableImageButton.setClickable(zA);
        checkableImageButton.setPressable(zA);
        checkableImageButton.setLongClickable(z10);
        e0.d.s(checkableImageButton, z11 ? 1 : 2);
    }

    private static void setIconOnClickListener(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private static void setIconOnLongClickListener(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        setIconClickable(checkableImageButton, onLongClickListener);
    }

    private void setPlaceholderTextEnabled(boolean z10) {
        if (this.placeholderEnabled == z10) {
            return;
        }
        if (z10) {
            addPlaceholderTextView();
        } else {
            removePlaceholderTextView();
            this.placeholderTextView = null;
        }
        this.placeholderEnabled = z10;
    }

    private boolean shouldUpdateEndDummyDrawable() {
        return (this.errorIconView.getVisibility() == 0 || ((hasEndIcon() && isEndIconVisible()) || this.suffixText != null)) && this.endLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUpdateStartDummyDrawable() {
        return (getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.startLayout.getMeasuredWidth() > 0;
    }

    private boolean shouldUseEditTextBackgroundForBoxBackground() {
        EditText editText = this.editText;
        return (editText == null || this.boxBackground == null || editText.getBackground() != null || this.boxBackgroundMode == 0) ? false : true;
    }

    private void showPlaceholderText() {
        if (this.placeholderTextView == null || !this.placeholderEnabled || TextUtils.isEmpty(this.placeholderText)) {
            return;
        }
        this.placeholderTextView.setText(this.placeholderText);
        n.a(this.inputFrame, this.placeholderFadeIn);
        this.placeholderTextView.setVisibility(0);
        this.placeholderTextView.bringToFront();
        announceForAccessibility(this.placeholderText);
    }

    private void tintEndIconOnError(boolean z10) {
        if (!z10 || getEndIconDrawable() == null) {
            IconHelper.applyIconTint(this, this.endIconView, this.endIconTintList, this.endIconTintMode);
            return;
        }
        Drawable drawableMutate = getEndIconDrawable().mutate();
        androidx.core.graphics.drawable.a.b.g(drawableMutate, this.indicatorViewController.getErrorViewCurrentTextColor());
        this.endIconView.setImageDrawable(drawableMutate);
    }

    private void updateBoxCollapsedPaddingTop() {
        Resources resources;
        int i10;
        if (this.boxBackgroundMode == 1) {
            if (MaterialResources.isFontScaleAtLeast2_0(getContext())) {
                resources = getResources();
                i10 = R.dimen.material_font_2_0_box_collapsed_padding_top;
            } else {
                if (!MaterialResources.isFontScaleAtLeast1_3(getContext())) {
                    return;
                }
                resources = getResources();
                i10 = R.dimen.material_font_1_3_box_collapsed_padding_top;
            }
            this.boxCollapsedPaddingTopPx = resources.getDimensionPixelSize(i10);
        }
    }

    private void updateBoxUnderlineBounds(Rect rect) {
        MaterialShapeDrawable materialShapeDrawable = this.boxUnderlineDefault;
        if (materialShapeDrawable != null) {
            int i10 = rect.bottom;
            materialShapeDrawable.setBounds(rect.left, i10 - this.boxStrokeWidthDefaultPx, rect.right, i10);
        }
        MaterialShapeDrawable materialShapeDrawable2 = this.boxUnderlineFocused;
        if (materialShapeDrawable2 != null) {
            int i11 = rect.bottom;
            materialShapeDrawable2.setBounds(rect.left, i11 - this.boxStrokeWidthFocusedPx, rect.right, i11);
        }
    }

    private void updateCounter() {
        if (this.counterView != null) {
            EditText editText = this.editText;
            updateCounter(editText == null ? 0 : editText.getText().length());
        }
    }

    private static void updateCounterContentDescription(Context context, TextView textView, int i10, int i11, boolean z10) {
        textView.setContentDescription(context.getString(z10 ? R.string.character_counter_overflowed_content_description : R.string.character_counter_content_description, Integer.valueOf(i10), Integer.valueOf(i11)));
    }

    private void updateCounterTextAppearanceAndColor() {
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.counterView;
        if (textView != null) {
            setTextAppearanceCompatWithErrorFallback(textView, this.counterOverflowed ? this.counterOverflowTextAppearance : this.counterTextAppearance);
            if (!this.counterOverflowed && (colorStateList2 = this.counterTextColor) != null) {
                this.counterView.setTextColor(colorStateList2);
            }
            if (!this.counterOverflowed || (colorStateList = this.counterOverflowTextColor) == null) {
                return;
            }
            this.counterView.setTextColor(colorStateList);
        }
    }

    private void updateDropdownMenuBackground() {
        if (this.endIconMode == 3 && this.boxBackgroundMode == 2) {
            ((DropdownMenuEndIconDelegate) this.endIconDelegates.get(3)).updateOutlinedRippleEffect((AutoCompleteTextView) this.editText);
        }
    }

    private boolean updateEditTextHeightBasedOnIcon() {
        int iMax;
        if (this.editText == null || this.editText.getMeasuredHeight() >= (iMax = Math.max(this.endLayout.getMeasuredHeight(), this.startLayout.getMeasuredHeight()))) {
            return false;
        }
        this.editText.setMinimumHeight(iMax);
        return true;
    }

    private void updateEndLayoutVisibility() {
        this.endIconFrame.setVisibility((this.endIconView.getVisibility() != 0 || isErrorIconVisible()) ? 8 : 0);
        this.endLayout.setVisibility(isEndIconVisible() || isErrorIconVisible() || ((this.suffixText == null || isHintExpanded()) ? '\b' : (char) 0) == 0 ? 0 : 8);
    }

    private void updateErrorIconVisibility() {
        this.errorIconView.setVisibility(getErrorIconDrawable() != null && this.indicatorViewController.isErrorEnabled() && this.indicatorViewController.errorShouldBeShown() ? 0 : 8);
        updateEndLayoutVisibility();
        updateSuffixTextViewPadding();
        if (hasEndIcon()) {
            return;
        }
        updateDummyDrawables();
    }

    private void updateInputLayoutMargins() {
        if (this.boxBackgroundMode != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.inputFrame.getLayoutParams();
            int iCalculateLabelMarginTop = calculateLabelMarginTop();
            if (iCalculateLabelMarginTop != layoutParams.topMargin) {
                layoutParams.topMargin = iCalculateLabelMarginTop;
                this.inputFrame.requestLayout();
            }
        }
    }

    private void updateLabelState(boolean z10, boolean z11) {
        ColorStateList textColors;
        CollapsingTextHelper collapsingTextHelper;
        TextView textView;
        boolean zIsEnabled = isEnabled();
        EditText editText = this.editText;
        boolean z12 = (editText == null || TextUtils.isEmpty(editText.getText())) ? false : true;
        EditText editText2 = this.editText;
        boolean z13 = editText2 != null && editText2.hasFocus();
        boolean zErrorShouldBeShown = this.indicatorViewController.errorShouldBeShown();
        ColorStateList colorStateList = this.defaultHintTextColor;
        if (colorStateList != null) {
            this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
            this.collapsingTextHelper.setExpandedTextColor(this.defaultHintTextColor);
        }
        if (!zIsEnabled) {
            ColorStateList colorStateList2 = this.defaultHintTextColor;
            int colorForState = colorStateList2 != null ? colorStateList2.getColorForState(new int[]{-16842910}, this.disabledColor) : this.disabledColor;
            this.collapsingTextHelper.setCollapsedTextColor(ColorStateList.valueOf(colorForState));
            this.collapsingTextHelper.setExpandedTextColor(ColorStateList.valueOf(colorForState));
        } else if (zErrorShouldBeShown) {
            this.collapsingTextHelper.setCollapsedTextColor(this.indicatorViewController.getErrorViewTextColors());
        } else {
            if (this.counterOverflowed && (textView = this.counterView) != null) {
                collapsingTextHelper = this.collapsingTextHelper;
                textColors = textView.getTextColors();
            } else if (z13 && (textColors = this.focusedTextColor) != null) {
                collapsingTextHelper = this.collapsingTextHelper;
            }
            collapsingTextHelper.setCollapsedTextColor(textColors);
        }
        if (z12 || !this.expandedHintEnabled || (isEnabled() && z13)) {
            if (z11 || this.hintExpanded) {
                collapseHint(z10);
                return;
            }
            return;
        }
        if (z11 || !this.hintExpanded) {
            expandHint(z10);
        }
    }

    private void updatePlaceholderMeasurementsBasedOnEditText() {
        EditText editText;
        if (this.placeholderTextView == null || (editText = this.editText) == null) {
            return;
        }
        this.placeholderTextView.setGravity(editText.getGravity());
        this.placeholderTextView.setPadding(this.editText.getCompoundPaddingLeft(), this.editText.getCompoundPaddingTop(), this.editText.getCompoundPaddingRight(), this.editText.getCompoundPaddingBottom());
    }

    private void updatePlaceholderText() {
        EditText editText = this.editText;
        updatePlaceholderText(editText == null ? 0 : editText.getText().length());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updatePlaceholderText(int i10) {
        if (i10 != 0 || this.hintExpanded) {
            hidePlaceholderText();
        } else {
            showPlaceholderText();
        }
    }

    private void updateStrokeErrorColor(boolean z10, boolean z11) {
        int defaultColor = this.strokeErrorColor.getDefaultColor();
        int colorForState = this.strokeErrorColor.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, defaultColor);
        int colorForState2 = this.strokeErrorColor.getColorForState(new int[]{android.R.attr.state_activated, android.R.attr.state_enabled}, defaultColor);
        if (z10) {
            this.boxStrokeColor = colorForState2;
        } else if (z11) {
            this.boxStrokeColor = colorForState;
        } else {
            this.boxStrokeColor = defaultColor;
        }
    }

    private void updateSuffixTextViewPadding() {
        int iE;
        if (this.editText == null) {
            return;
        }
        if (isEndIconVisible() || isErrorIconVisible()) {
            iE = 0;
        } else {
            EditText editText = this.editText;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            iE = e0.e.e(editText);
        }
        TextView textView = this.suffixTextView;
        int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.material_input_text_to_prefix_suffix_padding);
        int paddingTop = this.editText.getPaddingTop();
        int paddingBottom = this.editText.getPaddingBottom();
        WeakHashMap<View, m0> weakHashMap2 = e0.f34354a;
        e0.e.k(textView, dimensionPixelSize, paddingTop, iE, paddingBottom);
    }

    private void updateSuffixTextVisibility() {
        int visibility = this.suffixTextView.getVisibility();
        int i10 = (this.suffixText == null || isHintExpanded()) ? 8 : 0;
        if (visibility != i10) {
            getEndIconDelegate().onSuffixVisibilityChanged(i10 == 0);
        }
        updateEndLayoutVisibility();
        this.suffixTextView.setVisibility(i10);
        updateDummyDrawables();
    }

    public void addOnEditTextAttachedListener(OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.add(onEditTextAttachedListener);
        if (this.editText != null) {
            onEditTextAttachedListener.onEditTextAttached(this);
        }
    }

    public void addOnEndIconChangedListener(OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.add(onEndIconChangedListener);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof EditText)) {
            super.addView(view, i10, layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
        layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
        this.inputFrame.addView(view, layoutParams2);
        this.inputFrame.setLayoutParams(layoutParams);
        updateInputLayoutMargins();
        setEditText((EditText) view);
    }

    public void animateToExpansionFraction(float f10) {
        if (this.collapsingTextHelper.getExpansionFraction() == f10) {
            return;
        }
        if (this.animator == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.animator = valueAnimator;
            valueAnimator.setInterpolator(AnimationUtils.FAST_OUT_SLOW_IN_INTERPOLATOR);
            this.animator.setDuration(167L);
            this.animator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.textfield.TextInputLayout.4
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public void onAnimationUpdate(ValueAnimator valueAnimator2) {
                    TextInputLayout.this.collapsingTextHelper.setExpansionFraction(((Float) valueAnimator2.getAnimatedValue()).floatValue());
                }
            });
        }
        this.animator.setFloatValues(this.collapsingTextHelper.getExpansionFraction(), f10);
        this.animator.start();
    }

    public void clearOnEditTextAttachedListeners() {
        this.editTextAttachedListeners.clear();
    }

    public void clearOnEndIconChangedListeners() {
        this.endIconChangedListeners.clear();
    }

    public boolean cutoutIsOpen() {
        return cutoutEnabled() && ((CutoutDrawable) this.boxBackground).hasCutout();
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i10) {
        EditText editText = this.editText;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i10);
            return;
        }
        if (this.originalHint != null) {
            boolean z10 = this.isProvidingHint;
            this.isProvidingHint = false;
            CharSequence hint = editText.getHint();
            this.editText.setHint(this.originalHint);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i10);
                return;
            } finally {
                this.editText.setHint(hint);
                this.isProvidingHint = z10;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i10);
        onProvideAutofillVirtualStructure(viewStructure, i10);
        viewStructure.setChildCount(this.inputFrame.getChildCount());
        for (int i11 = 0; i11 < this.inputFrame.getChildCount(); i11++) {
            View childAt = this.inputFrame.getChildAt(i11);
            ViewStructure viewStructureNewChild = viewStructure.newChild(i11);
            childAt.dispatchProvideAutofillStructure(viewStructureNewChild, i10);
            if (childAt == this.editText) {
                viewStructureNewChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.restoringSavedState = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.restoringSavedState = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        drawHint(canvas);
        drawBoxUnderline(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.inDrawableStateChanged) {
            return;
        }
        this.inDrawableStateChanged = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        CollapsingTextHelper collapsingTextHelper = this.collapsingTextHelper;
        boolean state = collapsingTextHelper != null ? collapsingTextHelper.setState(drawableState) | false : false;
        if (this.editText != null) {
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            updateLabelState(e0.g.c(this) && isEnabled());
        }
        updateEditTextBackground();
        updateTextInputBoxState();
        if (state) {
            invalidate();
        }
        this.inDrawableStateChanged = false;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.editText;
        if (editText == null) {
            return super.getBaseline();
        }
        return getPaddingTop() + editText.getBaseline() + calculateLabelMarginTop();
    }

    public MaterialShapeDrawable getBoxBackground() {
        int i10 = this.boxBackgroundMode;
        if (i10 == 1 || i10 == 2) {
            return this.boxBackground;
        }
        throw new IllegalStateException();
    }

    public int getBoxBackgroundColor() {
        return this.boxBackgroundColor;
    }

    public int getBoxBackgroundMode() {
        return this.boxBackgroundMode;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.boxCollapsedPaddingTopPx;
    }

    public float getBoxCornerRadiusBottomEnd() {
        return (ViewUtils.isLayoutRtl(this) ? this.shapeAppearanceModel.getBottomLeftCornerSize() : this.shapeAppearanceModel.getBottomRightCornerSize()).getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusBottomStart() {
        return (ViewUtils.isLayoutRtl(this) ? this.shapeAppearanceModel.getBottomRightCornerSize() : this.shapeAppearanceModel.getBottomLeftCornerSize()).getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopEnd() {
        return (ViewUtils.isLayoutRtl(this) ? this.shapeAppearanceModel.getTopLeftCornerSize() : this.shapeAppearanceModel.getTopRightCornerSize()).getCornerSize(this.tmpRectF);
    }

    public float getBoxCornerRadiusTopStart() {
        return (ViewUtils.isLayoutRtl(this) ? this.shapeAppearanceModel.getTopRightCornerSize() : this.shapeAppearanceModel.getTopLeftCornerSize()).getCornerSize(this.tmpRectF);
    }

    public int getBoxStrokeColor() {
        return this.focusedStrokeColor;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.strokeErrorColor;
    }

    public int getBoxStrokeWidth() {
        return this.boxStrokeWidthDefaultPx;
    }

    public int getBoxStrokeWidthFocused() {
        return this.boxStrokeWidthFocusedPx;
    }

    public int getCounterMaxLength() {
        return this.counterMaxLength;
    }

    public CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.counterEnabled && this.counterOverflowed && (textView = this.counterView) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getCounterTextColor() {
        return this.counterTextColor;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.defaultHintTextColor;
    }

    public EditText getEditText() {
        return this.editText;
    }

    public CharSequence getEndIconContentDescription() {
        return this.endIconView.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.endIconView.getDrawable();
    }

    public int getEndIconMode() {
        return this.endIconMode;
    }

    public CheckableImageButton getEndIconView() {
        return this.endIconView;
    }

    public CharSequence getError() {
        if (this.indicatorViewController.isErrorEnabled()) {
            return this.indicatorViewController.getErrorText();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.indicatorViewController.getErrorContentDescription();
    }

    public int getErrorCurrentTextColors() {
        return this.indicatorViewController.getErrorViewCurrentTextColor();
    }

    public Drawable getErrorIconDrawable() {
        return this.errorIconView.getDrawable();
    }

    public final int getErrorTextCurrentColor() {
        return this.indicatorViewController.getErrorViewCurrentTextColor();
    }

    public CharSequence getHelperText() {
        if (this.indicatorViewController.isHelperTextEnabled()) {
            return this.indicatorViewController.getHelperText();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.indicatorViewController.getHelperTextViewCurrentTextColor();
    }

    public CharSequence getHint() {
        if (this.hintEnabled) {
            return this.hint;
        }
        return null;
    }

    public final float getHintCollapsedTextHeight() {
        return this.collapsingTextHelper.getCollapsedTextHeight();
    }

    public final int getHintCurrentCollapsedTextColor() {
        return this.collapsingTextHelper.getCurrentCollapsedTextColor();
    }

    public ColorStateList getHintTextColor() {
        return this.focusedTextColor;
    }

    public int getMaxEms() {
        return this.maxEms;
    }

    public int getMaxWidth() {
        return this.maxWidth;
    }

    public int getMinEms() {
        return this.minEms;
    }

    public int getMinWidth() {
        return this.minWidth;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.endIconView.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.endIconView.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.placeholderEnabled) {
            return this.placeholderText;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.placeholderTextAppearance;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.placeholderTextColor;
    }

    public CharSequence getPrefixText() {
        return this.startLayout.getPrefixText();
    }

    public ColorStateList getPrefixTextColor() {
        return this.startLayout.getPrefixTextColor();
    }

    public TextView getPrefixTextView() {
        return this.startLayout.getPrefixTextView();
    }

    public CharSequence getStartIconContentDescription() {
        return this.startLayout.getStartIconContentDescription();
    }

    public Drawable getStartIconDrawable() {
        return this.startLayout.getStartIconDrawable();
    }

    public CharSequence getSuffixText() {
        return this.suffixText;
    }

    public ColorStateList getSuffixTextColor() {
        return this.suffixTextView.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.suffixTextView;
    }

    public Typeface getTypeface() {
        return this.typeface;
    }

    public boolean isCounterEnabled() {
        return this.counterEnabled;
    }

    public boolean isEndIconCheckable() {
        return this.endIconView.isCheckable();
    }

    public boolean isEndIconVisible() {
        return this.endIconFrame.getVisibility() == 0 && this.endIconView.getVisibility() == 0;
    }

    public boolean isErrorEnabled() {
        return this.indicatorViewController.isErrorEnabled();
    }

    public boolean isExpandedHintEnabled() {
        return this.expandedHintEnabled;
    }

    public final boolean isHelperTextDisplayed() {
        return this.indicatorViewController.helperTextIsDisplayed();
    }

    public boolean isHelperTextEnabled() {
        return this.indicatorViewController.isHelperTextEnabled();
    }

    public boolean isHintAnimationEnabled() {
        return this.hintAnimationEnabled;
    }

    public boolean isHintEnabled() {
        return this.hintEnabled;
    }

    public final boolean isHintExpanded() {
        return this.hintExpanded;
    }

    @Deprecated
    public boolean isPasswordVisibilityToggleEnabled() {
        return this.endIconMode == 1;
    }

    public boolean isProvidingHint() {
        return this.isProvidingHint;
    }

    public boolean isStartIconCheckable() {
        return this.startLayout.isStartIconCheckable();
    }

    public boolean isStartIconVisible() {
        return this.startLayout.isStartIconVisible();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.collapsingTextHelper.maybeUpdateFontWeightAdjustment(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        EditText editText = this.editText;
        if (editText != null) {
            Rect rect = this.tmpRect;
            DescendantOffsetUtils.getDescendantRect(this, editText, rect);
            updateBoxUnderlineBounds(rect);
            if (this.hintEnabled) {
                this.collapsingTextHelper.setExpandedTextSize(this.editText.getTextSize());
                int gravity = this.editText.getGravity();
                this.collapsingTextHelper.setCollapsedTextGravity((gravity & (-113)) | 48);
                this.collapsingTextHelper.setExpandedTextGravity(gravity);
                this.collapsingTextHelper.setCollapsedBounds(calculateCollapsedTextBounds(rect));
                this.collapsingTextHelper.setExpandedBounds(calculateExpandedTextBounds(rect));
                this.collapsingTextHelper.recalculate();
                if (!cutoutEnabled() || this.hintExpanded) {
                    return;
                }
                openCutout();
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        boolean zUpdateEditTextHeightBasedOnIcon = updateEditTextHeightBasedOnIcon();
        boolean zUpdateDummyDrawables = updateDummyDrawables();
        if (zUpdateEditTextHeightBasedOnIcon || zUpdateDummyDrawables) {
            this.editText.post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.3
                @Override // java.lang.Runnable
                public void run() {
                    TextInputLayout.this.editText.requestLayout();
                }
            });
        }
        updatePlaceholderMeasurementsBasedOnEditText();
        updateSuffixTextViewPadding();
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        setError(savedState.error);
        if (savedState.isEndIconChecked) {
            this.endIconView.post(new Runnable() { // from class: com.google.android.material.textfield.TextInputLayout.2
                @Override // java.lang.Runnable
                public void run() {
                    TextInputLayout.this.endIconView.performClick();
                    TextInputLayout.this.endIconView.jumpDrawablesToCurrentState();
                }
            });
        }
        setHint(savedState.hintText);
        setHelperText(savedState.helperText);
        setPlaceholderText(savedState.placeholderText);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i10) {
        super.onRtlPropertiesChanged(i10);
        boolean z10 = false;
        boolean z11 = i10 == 1;
        boolean z12 = this.areCornerRadiiRtl;
        if (z11 != z12) {
            if (z11 && !z12) {
                z10 = true;
            }
            float cornerSize = this.shapeAppearanceModel.getTopLeftCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize2 = this.shapeAppearanceModel.getTopRightCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize3 = this.shapeAppearanceModel.getBottomLeftCornerSize().getCornerSize(this.tmpRectF);
            float cornerSize4 = this.shapeAppearanceModel.getBottomRightCornerSize().getCornerSize(this.tmpRectF);
            float f10 = z10 ? cornerSize : cornerSize2;
            if (z10) {
                cornerSize = cornerSize2;
            }
            float f11 = z10 ? cornerSize3 : cornerSize4;
            if (z10) {
                cornerSize3 = cornerSize4;
            }
            setBoxCornerRadii(f10, cornerSize, f11, cornerSize3);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        if (this.indicatorViewController.errorShouldBeShown()) {
            savedState.error = getError();
        }
        savedState.isEndIconChecked = hasEndIcon() && this.endIconView.isChecked();
        savedState.hintText = getHint();
        savedState.helperText = getHelperText();
        savedState.placeholderText = getPlaceholderText();
        return savedState;
    }

    @Deprecated
    public void passwordVisibilityToggleRequested(boolean z10) {
        if (this.endIconMode == 1) {
            this.endIconView.performClick();
            if (z10) {
                this.endIconView.jumpDrawablesToCurrentState();
            }
        }
    }

    public void refreshEndIconDrawableState() {
        IconHelper.refreshIconDrawableState(this, this.endIconView, this.endIconTintList);
    }

    public void refreshErrorIconDrawableState() {
        IconHelper.refreshIconDrawableState(this, this.errorIconView, this.errorIconTintList);
    }

    public void refreshStartIconDrawableState() {
        this.startLayout.refreshStartIconDrawableState();
    }

    public void removeOnEditTextAttachedListener(OnEditTextAttachedListener onEditTextAttachedListener) {
        this.editTextAttachedListeners.remove(onEditTextAttachedListener);
    }

    public void removeOnEndIconChangedListener(OnEndIconChangedListener onEndIconChangedListener) {
        this.endIconChangedListeners.remove(onEndIconChangedListener);
    }

    public void setBoxBackgroundColor(int i10) {
        if (this.boxBackgroundColor != i10) {
            this.boxBackgroundColor = i10;
            this.defaultFilledBackgroundColor = i10;
            this.focusedFilledBackgroundColor = i10;
            this.hoveredFilledBackgroundColor = i10;
            applyBoxAttributes();
        }
    }

    public void setBoxBackgroundColorResource(int i10) {
        Context context = getContext();
        Object obj = e0.a.f28964a;
        setBoxBackgroundColor(e0.a.d.a(context, i10));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.defaultFilledBackgroundColor = defaultColor;
        this.boxBackgroundColor = defaultColor;
        this.disabledFilledBackgroundColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.focusedFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        this.hoveredFilledBackgroundColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
        applyBoxAttributes();
    }

    public void setBoxBackgroundMode(int i10) {
        if (i10 == this.boxBackgroundMode) {
            return;
        }
        this.boxBackgroundMode = i10;
        if (this.editText != null) {
            onApplyBoxBackgroundMode();
        }
    }

    public void setBoxCollapsedPaddingTop(int i10) {
        this.boxCollapsedPaddingTopPx = i10;
    }

    public void setBoxCornerRadii(float f10, float f11, float f12, float f13) {
        boolean zIsLayoutRtl = ViewUtils.isLayoutRtl(this);
        this.areCornerRadiiRtl = zIsLayoutRtl;
        float f14 = zIsLayoutRtl ? f11 : f10;
        if (!zIsLayoutRtl) {
            f10 = f11;
        }
        float f15 = zIsLayoutRtl ? f13 : f12;
        if (!zIsLayoutRtl) {
            f12 = f13;
        }
        MaterialShapeDrawable materialShapeDrawable = this.boxBackground;
        if (materialShapeDrawable != null && materialShapeDrawable.getTopLeftCornerResolvedSize() == f14 && this.boxBackground.getTopRightCornerResolvedSize() == f10 && this.boxBackground.getBottomLeftCornerResolvedSize() == f15 && this.boxBackground.getBottomRightCornerResolvedSize() == f12) {
            return;
        }
        this.shapeAppearanceModel = this.shapeAppearanceModel.toBuilder().setTopLeftCornerSize(f14).setTopRightCornerSize(f10).setBottomLeftCornerSize(f15).setBottomRightCornerSize(f12).build();
        applyBoxAttributes();
    }

    public void setBoxCornerRadiiResources(int i10, int i11, int i12, int i13) {
        setBoxCornerRadii(getContext().getResources().getDimension(i10), getContext().getResources().getDimension(i11), getContext().getResources().getDimension(i13), getContext().getResources().getDimension(i12));
    }

    public void setBoxStrokeColor(int i10) {
        if (this.focusedStrokeColor != i10) {
            this.focusedStrokeColor = i10;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        int defaultColor;
        if (!colorStateList.isStateful()) {
            if (this.focusedStrokeColor != colorStateList.getDefaultColor()) {
                defaultColor = colorStateList.getDefaultColor();
            }
            updateTextInputBoxState();
        } else {
            this.defaultStrokeColor = colorStateList.getDefaultColor();
            this.disabledColor = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.hoveredStrokeColor = colorStateList.getColorForState(new int[]{android.R.attr.state_hovered, android.R.attr.state_enabled}, -1);
            defaultColor = colorStateList.getColorForState(new int[]{android.R.attr.state_focused, android.R.attr.state_enabled}, -1);
        }
        this.focusedStrokeColor = defaultColor;
        updateTextInputBoxState();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.strokeErrorColor != colorStateList) {
            this.strokeErrorColor = colorStateList;
            updateTextInputBoxState();
        }
    }

    public void setBoxStrokeWidth(int i10) {
        this.boxStrokeWidthDefaultPx = i10;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocused(int i10) {
        this.boxStrokeWidthFocusedPx = i10;
        updateTextInputBoxState();
    }

    public void setBoxStrokeWidthFocusedResource(int i10) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i10));
    }

    public void setBoxStrokeWidthResource(int i10) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i10));
    }

    public void setCounterEnabled(boolean z10) {
        if (this.counterEnabled != z10) {
            if (z10) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.counterView = appCompatTextView;
                appCompatTextView.setId(R.id.textinput_counter);
                Typeface typeface = this.typeface;
                if (typeface != null) {
                    this.counterView.setTypeface(typeface);
                }
                this.counterView.setMaxLines(1);
                this.indicatorViewController.addIndicator(this.counterView, 2);
                h.h((ViewGroup.MarginLayoutParams) this.counterView.getLayoutParams(), getResources().getDimensionPixelOffset(R.dimen.mtrl_textinput_counter_margin_start));
                updateCounterTextAppearanceAndColor();
                updateCounter();
            } else {
                this.indicatorViewController.removeIndicator(this.counterView, 2);
                this.counterView = null;
            }
            this.counterEnabled = z10;
        }
    }

    public void setCounterMaxLength(int i10) {
        if (this.counterMaxLength != i10) {
            if (i10 <= 0) {
                i10 = -1;
            }
            this.counterMaxLength = i10;
            if (this.counterEnabled) {
                updateCounter();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i10) {
        if (this.counterOverflowTextAppearance != i10) {
            this.counterOverflowTextAppearance = i10;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.counterOverflowTextColor != colorStateList) {
            this.counterOverflowTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextAppearance(int i10) {
        if (this.counterTextAppearance != i10) {
            this.counterTextAppearance = i10;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.counterTextColor != colorStateList) {
            this.counterTextColor = colorStateList;
            updateCounterTextAppearanceAndColor();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.defaultHintTextColor = colorStateList;
        this.focusedTextColor = colorStateList;
        if (this.editText != null) {
            updateLabelState(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z10) {
        recursiveSetEnabled(this, z10);
        super.setEnabled(z10);
    }

    public void setEndIconActivated(boolean z10) {
        this.endIconView.setActivated(z10);
    }

    public void setEndIconCheckable(boolean z10) {
        this.endIconView.setCheckable(z10);
    }

    public void setEndIconContentDescription(int i10) {
        setEndIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.endIconView.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(int i10) {
        setEndIconDrawable(i10 != 0 ? e.a.b(getContext(), i10) : null);
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
        if (drawable != null) {
            IconHelper.applyIconTint(this, this.endIconView, this.endIconTintList, this.endIconTintMode);
            refreshEndIconDrawableState();
        }
    }

    public void setEndIconMode(int i10) {
        int i11 = this.endIconMode;
        if (i11 == i10) {
            return;
        }
        this.endIconMode = i10;
        dispatchOnEndIconChanged(i11);
        setEndIconVisible(i10 != 0);
        if (getEndIconDelegate().isBoxBackgroundModeSupported(this.boxBackgroundMode)) {
            getEndIconDelegate().initialize();
            IconHelper.applyIconTint(this, this.endIconView, this.endIconTintList, this.endIconTintMode);
        } else {
            StringBuilder sbA = defpackage.a.a("The current box background mode ");
            sbA.append(this.boxBackgroundMode);
            sbA.append(" is not supported by the end icon mode ");
            sbA.append(i10);
            throw new IllegalStateException(sbA.toString());
        }
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.endIconView, onClickListener, this.endIconOnLongClickListener);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.endIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.endIconView, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.endIconTintList != colorStateList) {
            this.endIconTintList = colorStateList;
            IconHelper.applyIconTint(this, this.endIconView, colorStateList, this.endIconTintMode);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.endIconTintMode != mode) {
            this.endIconTintMode = mode;
            IconHelper.applyIconTint(this, this.endIconView, this.endIconTintList, mode);
        }
    }

    public void setEndIconVisible(boolean z10) {
        if (isEndIconVisible() != z10) {
            this.endIconView.setVisibility(z10 ? 0 : 8);
            updateEndLayoutVisibility();
            updateSuffixTextViewPadding();
            updateDummyDrawables();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.indicatorViewController.isErrorEnabled()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            } else {
                setErrorEnabled(true);
            }
        }
        if (TextUtils.isEmpty(charSequence)) {
            this.indicatorViewController.hideError();
        } else {
            this.indicatorViewController.showError(charSequence);
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.indicatorViewController.setErrorContentDescription(charSequence);
    }

    public void setErrorEnabled(boolean z10) {
        this.indicatorViewController.setErrorEnabled(z10);
    }

    public void setErrorIconDrawable(int i10) {
        setErrorIconDrawable(i10 != 0 ? e.a.b(getContext(), i10) : null);
        refreshErrorIconDrawableState();
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.errorIconView.setImageDrawable(drawable);
        updateErrorIconVisibility();
        IconHelper.applyIconTint(this, this.errorIconView, this.errorIconTintList, this.errorIconTintMode);
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        setIconOnClickListener(this.errorIconView, onClickListener, this.errorIconOnLongClickListener);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.errorIconOnLongClickListener = onLongClickListener;
        setIconOnLongClickListener(this.errorIconView, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.errorIconTintList != colorStateList) {
            this.errorIconTintList = colorStateList;
            IconHelper.applyIconTint(this, this.errorIconView, colorStateList, this.errorIconTintMode);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.errorIconTintMode != mode) {
            this.errorIconTintMode = mode;
            IconHelper.applyIconTint(this, this.errorIconView, this.errorIconTintList, mode);
        }
    }

    public void setErrorTextAppearance(int i10) {
        this.indicatorViewController.setErrorTextAppearance(i10);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.indicatorViewController.setErrorViewTextColor(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z10) {
        if (this.expandedHintEnabled != z10) {
            this.expandedHintEnabled = z10;
            updateLabelState(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (isHelperTextEnabled()) {
                setHelperTextEnabled(false);
            }
        } else {
            if (!isHelperTextEnabled()) {
                setHelperTextEnabled(true);
            }
            this.indicatorViewController.showHelper(charSequence);
        }
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.indicatorViewController.setHelperTextViewTextColor(colorStateList);
    }

    public void setHelperTextEnabled(boolean z10) {
        this.indicatorViewController.setHelperTextEnabled(z10);
    }

    public void setHelperTextTextAppearance(int i10) {
        this.indicatorViewController.setHelperTextAppearance(i10);
    }

    public void setHint(int i10) {
        setHint(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setHint(CharSequence charSequence) {
        if (this.hintEnabled) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(2048);
        }
    }

    public void setHintAnimationEnabled(boolean z10) {
        this.hintAnimationEnabled = z10;
    }

    public void setHintEnabled(boolean z10) {
        if (z10 != this.hintEnabled) {
            this.hintEnabled = z10;
            if (z10) {
                CharSequence hint = this.editText.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.hint)) {
                        setHint(hint);
                    }
                    this.editText.setHint((CharSequence) null);
                }
                this.isProvidingHint = true;
            } else {
                this.isProvidingHint = false;
                if (!TextUtils.isEmpty(this.hint) && TextUtils.isEmpty(this.editText.getHint())) {
                    this.editText.setHint(this.hint);
                }
                setHintInternal(null);
            }
            if (this.editText != null) {
                updateInputLayoutMargins();
            }
        }
    }

    public void setHintTextAppearance(int i10) {
        this.collapsingTextHelper.setCollapsedTextAppearance(i10);
        this.focusedTextColor = this.collapsingTextHelper.getCollapsedTextColor();
        if (this.editText != null) {
            updateLabelState(false);
            updateInputLayoutMargins();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.focusedTextColor != colorStateList) {
            if (this.defaultHintTextColor == null) {
                this.collapsingTextHelper.setCollapsedTextColor(colorStateList);
            }
            this.focusedTextColor = colorStateList;
            if (this.editText != null) {
                updateLabelState(false);
            }
        }
    }

    public void setMaxEms(int i10) {
        this.maxEms = i10;
        EditText editText = this.editText;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxEms(i10);
    }

    public void setMaxWidth(int i10) {
        this.maxWidth = i10;
        EditText editText = this.editText;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMaxWidth(i10);
    }

    public void setMaxWidthResource(int i10) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    public void setMinEms(int i10) {
        this.minEms = i10;
        EditText editText = this.editText;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinEms(i10);
    }

    public void setMinWidth(int i10) {
        this.minWidth = i10;
        EditText editText = this.editText;
        if (editText == null || i10 == -1) {
            return;
        }
        editText.setMinWidth(i10);
    }

    public void setMinWidthResource(int i10) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i10));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i10) {
        setPasswordVisibilityToggleContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.endIconView.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i10) {
        setPasswordVisibilityToggleDrawable(i10 != 0 ? e.a.b(getContext(), i10) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.endIconView.setImageDrawable(drawable);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z10) {
        if (z10 && this.endIconMode != 1) {
            setEndIconMode(1);
        } else {
            if (z10) {
                return;
            }
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.endIconTintList = colorStateList;
        IconHelper.applyIconTint(this, this.endIconView, colorStateList, this.endIconTintMode);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.endIconTintMode = mode;
        IconHelper.applyIconTint(this, this.endIconView, this.endIconTintList, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.placeholderTextView == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.placeholderTextView = appCompatTextView;
            appCompatTextView.setId(R.id.textinput_placeholder);
            TextView textView = this.placeholderTextView;
            WeakHashMap<View, m0> weakHashMap = e0.f34354a;
            e0.d.s(textView, 2);
            d dVarCreatePlaceholderFadeTransition = createPlaceholderFadeTransition();
            this.placeholderFadeIn = dVarCreatePlaceholderFadeTransition;
            dVarCreatePlaceholderFadeTransition.setStartDelay(PLACEHOLDER_START_DELAY);
            this.placeholderFadeOut = createPlaceholderFadeTransition();
            setPlaceholderTextAppearance(this.placeholderTextAppearance);
            setPlaceholderTextColor(this.placeholderTextColor);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.placeholderEnabled) {
                setPlaceholderTextEnabled(true);
            }
            this.placeholderText = charSequence;
        }
        updatePlaceholderText();
    }

    public void setPlaceholderTextAppearance(int i10) {
        this.placeholderTextAppearance = i10;
        TextView textView = this.placeholderTextView;
        if (textView != null) {
            textView.setTextAppearance(i10);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.placeholderTextColor != colorStateList) {
            this.placeholderTextColor = colorStateList;
            TextView textView = this.placeholderTextView;
            if (textView == null || colorStateList == null) {
                return;
            }
            textView.setTextColor(colorStateList);
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.startLayout.setPrefixText(charSequence);
    }

    public void setPrefixTextAppearance(int i10) {
        this.startLayout.setPrefixTextAppearance(i10);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.startLayout.setPrefixTextColor(colorStateList);
    }

    public void setStartIconCheckable(boolean z10) {
        this.startLayout.setStartIconCheckable(z10);
    }

    public void setStartIconContentDescription(int i10) {
        setStartIconContentDescription(i10 != 0 ? getResources().getText(i10) : null);
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.startLayout.setStartIconContentDescription(charSequence);
    }

    public void setStartIconDrawable(int i10) {
        setStartIconDrawable(i10 != 0 ? e.a.b(getContext(), i10) : null);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.startLayout.setStartIconDrawable(drawable);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.startLayout.setStartIconOnClickListener(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.startLayout.setStartIconOnLongClickListener(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.startLayout.setStartIconTintList(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.startLayout.setStartIconTintMode(mode);
    }

    public void setStartIconVisible(boolean z10) {
        this.startLayout.setStartIconVisible(z10);
    }

    public void setSuffixText(CharSequence charSequence) {
        this.suffixText = TextUtils.isEmpty(charSequence) ? null : charSequence;
        this.suffixTextView.setText(charSequence);
        updateSuffixTextVisibility();
    }

    public void setSuffixTextAppearance(int i10) {
        this.suffixTextView.setTextAppearance(i10);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.suffixTextView.setTextColor(colorStateList);
    }

    public void setTextAppearanceCompatWithErrorFallback(TextView textView, int i10) {
        boolean z10 = true;
        try {
            textView.setTextAppearance(i10);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z10 = false;
            }
        } catch (Exception unused) {
        }
        if (z10) {
            textView.setTextAppearance(R.style.TextAppearance_AppCompat_Caption);
            Context context = getContext();
            int i11 = R.color.design_error;
            Object obj = e0.a.f28964a;
            textView.setTextColor(e0.a.d.a(context, i11));
        }
    }

    public void setTextInputAccessibilityDelegate(AccessibilityDelegate accessibilityDelegate) {
        EditText editText = this.editText;
        if (editText != null) {
            e0.q(editText, accessibilityDelegate);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.typeface) {
            this.typeface = typeface;
            this.collapsingTextHelper.setTypefaces(typeface);
            this.indicatorViewController.setTypefaces(typeface);
            TextView textView = this.counterView;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    public void updateCounter(int i10) {
        boolean z10 = this.counterOverflowed;
        int i11 = this.counterMaxLength;
        if (i11 == -1) {
            this.counterView.setText(String.valueOf(i10));
            this.counterView.setContentDescription(null);
            this.counterOverflowed = false;
        } else {
            this.counterOverflowed = i10 > i11;
            updateCounterContentDescription(getContext(), this.counterView, i10, this.counterMaxLength, this.counterOverflowed);
            if (z10 != this.counterOverflowed) {
                updateCounterTextAppearanceAndColor();
            }
            n0.a aVarC = n0.a.c();
            TextView textView = this.counterView;
            String string = getContext().getString(R.string.character_counter_pattern, Integer.valueOf(i10), Integer.valueOf(this.counterMaxLength));
            textView.setText(string != null ? aVarC.d(string, aVarC.f33582c, true).toString() : null);
        }
        if (this.editText == null || z10 == this.counterOverflowed) {
            return;
        }
        updateLabelState(false);
        updateTextInputBoxState();
        updateEditTextBackground();
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0062  */
    public boolean updateDummyDrawables() {
        boolean z10;
        if (this.editText == null) {
            return false;
        }
        boolean z11 = true;
        if (shouldUpdateStartDummyDrawable()) {
            int measuredWidth = this.startLayout.getMeasuredWidth() - this.editText.getPaddingLeft();
            if (this.startDummyDrawable == null || this.startDummyDrawableWidth != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.startDummyDrawable = colorDrawable;
                this.startDummyDrawableWidth = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] drawableArrA = j.b.a(this.editText);
            Drawable drawable = drawableArrA[0];
            Drawable drawable2 = this.startDummyDrawable;
            if (drawable != drawable2) {
                j.b.e(this.editText, drawable2, drawableArrA[1], drawableArrA[2], drawableArrA[3]);
                z10 = true;
            } else {
                z10 = false;
            }
        } else if (this.startDummyDrawable != null) {
            Drawable[] drawableArrA2 = j.b.a(this.editText);
            j.b.e(this.editText, null, drawableArrA2[1], drawableArrA2[2], drawableArrA2[3]);
            this.startDummyDrawable = null;
            z10 = true;
        } else {
            z10 = false;
        }
        if (shouldUpdateEndDummyDrawable()) {
            int measuredWidth2 = this.suffixTextView.getMeasuredWidth() - this.editText.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = h.c((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams()) + endIconToUpdateDummyDrawable.getMeasuredWidth() + measuredWidth2;
            }
            Drawable[] drawableArrA3 = j.b.a(this.editText);
            Drawable drawable3 = this.endDummyDrawable;
            if (drawable3 == null || this.endDummyDrawableWidth == measuredWidth2) {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.endDummyDrawable = colorDrawable2;
                    this.endDummyDrawableWidth = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = drawableArrA3[2];
                Drawable drawable5 = this.endDummyDrawable;
                if (drawable4 != drawable5) {
                    this.originalEditTextEndDrawable = drawableArrA3[2];
                    j.b.e(this.editText, drawableArrA3[0], drawableArrA3[1], drawable5, drawableArrA3[3]);
                } else {
                    z11 = z10;
                }
            } else {
                this.endDummyDrawableWidth = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                j.b.e(this.editText, drawableArrA3[0], drawableArrA3[1], this.endDummyDrawable, drawableArrA3[3]);
            }
        } else {
            if (this.endDummyDrawable == null) {
                return z10;
            }
            Drawable[] drawableArrA4 = j.b.a(this.editText);
            if (drawableArrA4[2] == this.endDummyDrawable) {
                j.b.e(this.editText, drawableArrA4[0], drawableArrA4[1], this.originalEditTextEndDrawable, drawableArrA4[3]);
            } else {
                z11 = z10;
            }
            this.endDummyDrawable = null;
        }
        return z11;
    }

    public void updateEditTextBackground() {
        Drawable background;
        TextView textView;
        int currentTextColor;
        EditText editText = this.editText;
        if (editText == null || this.boxBackgroundMode != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        int[] iArr = c0.f1152a;
        Drawable drawableMutate = background.mutate();
        if (this.indicatorViewController.errorShouldBeShown()) {
            currentTextColor = this.indicatorViewController.getErrorViewCurrentTextColor();
        } else {
            if (!this.counterOverflowed || (textView = this.counterView) == null) {
                drawableMutate.clearColorFilter();
                this.editText.refreshDrawableState();
                return;
            }
            currentTextColor = textView.getCurrentTextColor();
        }
        drawableMutate.setColorFilter(androidx.appcompat.widget.j.c(currentTextColor, PorterDuff.Mode.SRC_IN));
    }

    public void updateLabelState(boolean z10) {
        updateLabelState(z10, false);
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0048  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    public void updateTextInputBoxState() {
        int currentTextColor;
        TextView textView;
        int i10;
        int i11;
        int i12;
        EditText editText;
        EditText editText2;
        if (this.boxBackground == null || this.boxBackgroundMode == 0) {
            return;
        }
        boolean z10 = false;
        boolean z11 = isFocused() || ((editText2 = this.editText) != null && editText2.hasFocus());
        if (isHovered() || ((editText = this.editText) != null && editText.isHovered())) {
            z10 = true;
        }
        if (isEnabled()) {
            if (this.indicatorViewController.errorShouldBeShown()) {
                if (this.strokeErrorColor != null) {
                    updateStrokeErrorColor(z11, z10);
                } else {
                    currentTextColor = this.indicatorViewController.getErrorViewCurrentTextColor();
                }
            } else if (!this.counterOverflowed || (textView = this.counterView) == null) {
                if (z11) {
                    currentTextColor = this.focusedStrokeColor;
                } else {
                    currentTextColor = z10 ? this.hoveredStrokeColor : this.defaultStrokeColor;
                }
            } else if (this.strokeErrorColor != null) {
                updateStrokeErrorColor(z11, z10);
            } else {
                currentTextColor = textView.getCurrentTextColor();
            }
            updateErrorIconVisibility();
            refreshErrorIconDrawableState();
            refreshStartIconDrawableState();
            refreshEndIconDrawableState();
            if (getEndIconDelegate().shouldTintIconOnError()) {
                tintEndIconOnError(this.indicatorViewController.errorShouldBeShown());
            }
            if (this.boxBackgroundMode == 2) {
                i11 = this.boxStrokeWidthPx;
                if (z11 || !isEnabled()) {
                    i12 = this.boxStrokeWidthDefaultPx;
                } else {
                    i12 = this.boxStrokeWidthFocusedPx;
                }
                this.boxStrokeWidthPx = i12;
                if (this.boxStrokeWidthPx != i11) {
                    recalculateCutout();
                }
            }
            if (this.boxBackgroundMode == 1) {
                if (!isEnabled()) {
                    i10 = this.disabledFilledBackgroundColor;
                } else if (!z10 && !z11) {
                    i10 = this.hoveredFilledBackgroundColor;
                } else if (z11) {
                    i10 = this.focusedFilledBackgroundColor;
                } else {
                    i10 = this.defaultFilledBackgroundColor;
                }
                this.boxBackgroundColor = i10;
            }
            applyBoxAttributes();
        }
        currentTextColor = this.disabledColor;
        this.boxStrokeColor = currentTextColor;
        updateErrorIconVisibility();
        refreshErrorIconDrawableState();
        refreshStartIconDrawableState();
        refreshEndIconDrawableState();
        if (getEndIconDelegate().shouldTintIconOnError()) {
            tintEndIconOnError(this.indicatorViewController.errorShouldBeShown());
        }
        if (this.boxBackgroundMode == 2) {
            i11 = this.boxStrokeWidthPx;
            if (z11) {
                i12 = this.boxStrokeWidthDefaultPx;
            } else {
                i12 = this.boxStrokeWidthDefaultPx;
            }
            this.boxStrokeWidthPx = i12;
            if (this.boxStrokeWidthPx != i11) {
                recalculateCutout();
            }
        }
        if (this.boxBackgroundMode == 1) {
            if (!isEnabled()) {
                i10 = this.disabledFilledBackgroundColor;
            } else if (!z10) {
                if (z11) {
                    i10 = this.focusedFilledBackgroundColor;
                } else {
                    i10 = this.defaultFilledBackgroundColor;
                }
            } else if (z11) {
                i10 = this.focusedFilledBackgroundColor;
            } else {
                i10 = this.defaultFilledBackgroundColor;
            }
            this.boxBackgroundColor = i10;
        }
        applyBoxAttributes();
    }
}
