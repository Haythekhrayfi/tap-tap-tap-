package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.R;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public final class BadgeState {
    private static final String BADGE_RESOURCE_TAG = "badge";
    private static final int DEFAULT_MAX_BADGE_CHARACTER_COUNT = 4;
    public final float badgeRadius;
    public final float badgeWidePadding;
    public final float badgeWithTextRadius;
    private final State currentState;
    private final State overridingState;

    public static final class State implements Parcelable {
        private static final int BADGE_NUMBER_NONE = -1;
        public static final Parcelable.Creator<State> CREATOR = new Parcelable.Creator<State>() { // from class: com.google.android.material.badge.BadgeState.State.1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public State createFromParcel(Parcel parcel) {
                return new State(parcel);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public State[] newArray(int i10) {
                return new State[i10];
            }
        };
        private static final int NOT_SET = -2;
        private Integer additionalHorizontalOffset;
        private Integer additionalVerticalOffset;
        private int alpha;
        private Integer backgroundColor;
        private Integer badgeGravity;
        private int badgeResId;
        private Integer badgeTextColor;
        private int contentDescriptionExceedsMaxBadgeNumberRes;
        private CharSequence contentDescriptionNumberless;
        private int contentDescriptionQuantityStrings;
        private Integer horizontalOffsetWithText;
        private Integer horizontalOffsetWithoutText;
        private Boolean isVisible;
        private int maxCharacterCount;
        private int number;
        private Locale numberLocale;
        private Integer verticalOffsetWithText;
        private Integer verticalOffsetWithoutText;

        public State() {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.isVisible = Boolean.TRUE;
        }

        public State(Parcel parcel) {
            this.alpha = 255;
            this.number = -2;
            this.maxCharacterCount = -2;
            this.isVisible = Boolean.TRUE;
            this.badgeResId = parcel.readInt();
            this.backgroundColor = (Integer) parcel.readSerializable();
            this.badgeTextColor = (Integer) parcel.readSerializable();
            this.alpha = parcel.readInt();
            this.number = parcel.readInt();
            this.maxCharacterCount = parcel.readInt();
            this.contentDescriptionNumberless = parcel.readString();
            this.contentDescriptionQuantityStrings = parcel.readInt();
            this.badgeGravity = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithoutText = (Integer) parcel.readSerializable();
            this.horizontalOffsetWithText = (Integer) parcel.readSerializable();
            this.verticalOffsetWithText = (Integer) parcel.readSerializable();
            this.additionalHorizontalOffset = (Integer) parcel.readSerializable();
            this.additionalVerticalOffset = (Integer) parcel.readSerializable();
            this.isVisible = (Boolean) parcel.readSerializable();
            this.numberLocale = (Locale) parcel.readSerializable();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.badgeResId);
            parcel.writeSerializable(this.backgroundColor);
            parcel.writeSerializable(this.badgeTextColor);
            parcel.writeInt(this.alpha);
            parcel.writeInt(this.number);
            parcel.writeInt(this.maxCharacterCount);
            CharSequence charSequence = this.contentDescriptionNumberless;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.contentDescriptionQuantityStrings);
            parcel.writeSerializable(this.badgeGravity);
            parcel.writeSerializable(this.horizontalOffsetWithoutText);
            parcel.writeSerializable(this.verticalOffsetWithoutText);
            parcel.writeSerializable(this.horizontalOffsetWithText);
            parcel.writeSerializable(this.verticalOffsetWithText);
            parcel.writeSerializable(this.additionalHorizontalOffset);
            parcel.writeSerializable(this.additionalVerticalOffset);
            parcel.writeSerializable(this.isVisible);
            parcel.writeSerializable(this.numberLocale);
        }
    }

    public BadgeState(Context context, int i10, int i11, int i12, State state) {
        int i13;
        Integer numValueOf;
        State state2 = new State();
        this.currentState = state2;
        state = state == null ? new State() : state;
        if (i10 != 0) {
            state.badgeResId = i10;
        }
        TypedArray typedArrayGenerateTypedArray = generateTypedArray(context, state.badgeResId, i11, i12);
        Resources resources = context.getResources();
        this.badgeRadius = typedArrayGenerateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeRadius, resources.getDimensionPixelSize(R.dimen.mtrl_badge_radius));
        this.badgeWidePadding = typedArrayGenerateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.badgeWithTextRadius = typedArrayGenerateTypedArray.getDimensionPixelSize(R.styleable.Badge_badgeWithTextRadius, resources.getDimensionPixelSize(R.dimen.mtrl_badge_with_text_radius));
        state2.alpha = state.alpha == -2 ? 255 : state.alpha;
        state2.contentDescriptionNumberless = state.contentDescriptionNumberless == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : state.contentDescriptionNumberless;
        state2.contentDescriptionQuantityStrings = state.contentDescriptionQuantityStrings == 0 ? R.plurals.mtrl_badge_content_description : state.contentDescriptionQuantityStrings;
        state2.contentDescriptionExceedsMaxBadgeNumberRes = state.contentDescriptionExceedsMaxBadgeNumberRes == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : state.contentDescriptionExceedsMaxBadgeNumberRes;
        state2.isVisible = Boolean.valueOf(state.isVisible == null || state.isVisible.booleanValue());
        state2.maxCharacterCount = state.maxCharacterCount == -2 ? typedArrayGenerateTypedArray.getInt(R.styleable.Badge_maxCharacterCount, 4) : state.maxCharacterCount;
        if (state.number != -2) {
            i13 = state.number;
        } else {
            int i14 = R.styleable.Badge_number;
            i13 = typedArrayGenerateTypedArray.hasValue(i14) ? typedArrayGenerateTypedArray.getInt(i14, 0) : -1;
        }
        state2.number = i13;
        state2.backgroundColor = Integer.valueOf(state.backgroundColor == null ? readColorFromAttributes(context, typedArrayGenerateTypedArray, R.styleable.Badge_backgroundColor) : state.backgroundColor.intValue());
        if (state.badgeTextColor != null) {
            numValueOf = state.badgeTextColor;
        } else {
            int i15 = R.styleable.Badge_badgeTextColor;
            numValueOf = Integer.valueOf(typedArrayGenerateTypedArray.hasValue(i15) ? readColorFromAttributes(context, typedArrayGenerateTypedArray, i15) : new TextAppearance(context, R.style.TextAppearance_MaterialComponents_Badge).getTextColor().getDefaultColor());
        }
        state2.badgeTextColor = numValueOf;
        state2.badgeGravity = Integer.valueOf(state.badgeGravity == null ? typedArrayGenerateTypedArray.getInt(R.styleable.Badge_badgeGravity, 8388661) : state.badgeGravity.intValue());
        state2.horizontalOffsetWithoutText = Integer.valueOf(state.horizontalOffsetWithoutText == null ? typedArrayGenerateTypedArray.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0) : state.horizontalOffsetWithoutText.intValue());
        state2.verticalOffsetWithoutText = Integer.valueOf(state.horizontalOffsetWithoutText == null ? typedArrayGenerateTypedArray.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0) : state.verticalOffsetWithoutText.intValue());
        state2.horizontalOffsetWithText = Integer.valueOf(state.horizontalOffsetWithText == null ? typedArrayGenerateTypedArray.getDimensionPixelOffset(R.styleable.Badge_horizontalOffsetWithText, state2.horizontalOffsetWithoutText.intValue()) : state.horizontalOffsetWithText.intValue());
        state2.verticalOffsetWithText = Integer.valueOf(state.verticalOffsetWithText == null ? typedArrayGenerateTypedArray.getDimensionPixelOffset(R.styleable.Badge_verticalOffsetWithText, state2.verticalOffsetWithoutText.intValue()) : state.verticalOffsetWithText.intValue());
        state2.additionalHorizontalOffset = Integer.valueOf(state.additionalHorizontalOffset == null ? 0 : state.additionalHorizontalOffset.intValue());
        state2.additionalVerticalOffset = Integer.valueOf(state.additionalVerticalOffset != null ? state.additionalVerticalOffset.intValue() : 0);
        typedArrayGenerateTypedArray.recycle();
        state2.numberLocale = state.numberLocale == null ? Locale.getDefault(Locale.Category.FORMAT) : state.numberLocale;
        this.overridingState = state;
    }

    private TypedArray generateTypedArray(Context context, int i10, int i11, int i12) {
        AttributeSet attributeSet;
        int styleAttribute;
        if (i10 != 0) {
            AttributeSet drawableXml = DrawableUtils.parseDrawableXml(context, i10, BADGE_RESOURCE_TAG);
            styleAttribute = drawableXml.getStyleAttribute();
            attributeSet = drawableXml;
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        return ThemeEnforcement.obtainStyledAttributes(context, attributeSet, R.styleable.Badge, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
    }

    private static int readColorFromAttributes(Context context, TypedArray typedArray, int i10) {
        return MaterialResources.getColorStateList(context, typedArray, i10).getDefaultColor();
    }

    public void clearNumber() {
        setNumber(-1);
    }

    public int getAdditionalHorizontalOffset() {
        return this.currentState.additionalHorizontalOffset.intValue();
    }

    public int getAdditionalVerticalOffset() {
        return this.currentState.additionalVerticalOffset.intValue();
    }

    public int getAlpha() {
        return this.currentState.alpha;
    }

    public int getBackgroundColor() {
        return this.currentState.backgroundColor.intValue();
    }

    public int getBadgeGravity() {
        return this.currentState.badgeGravity.intValue();
    }

    public int getBadgeTextColor() {
        return this.currentState.badgeTextColor.intValue();
    }

    public int getContentDescriptionExceedsMaxBadgeNumberStringResource() {
        return this.currentState.contentDescriptionExceedsMaxBadgeNumberRes;
    }

    public CharSequence getContentDescriptionNumberless() {
        return this.currentState.contentDescriptionNumberless;
    }

    public int getContentDescriptionQuantityStrings() {
        return this.currentState.contentDescriptionQuantityStrings;
    }

    public int getHorizontalOffsetWithText() {
        return this.currentState.horizontalOffsetWithText.intValue();
    }

    public int getHorizontalOffsetWithoutText() {
        return this.currentState.horizontalOffsetWithoutText.intValue();
    }

    public int getMaxCharacterCount() {
        return this.currentState.maxCharacterCount;
    }

    public int getNumber() {
        return this.currentState.number;
    }

    public Locale getNumberLocale() {
        return this.currentState.numberLocale;
    }

    public State getOverridingState() {
        return this.overridingState;
    }

    public int getVerticalOffsetWithText() {
        return this.currentState.verticalOffsetWithText.intValue();
    }

    public int getVerticalOffsetWithoutText() {
        return this.currentState.verticalOffsetWithoutText.intValue();
    }

    public boolean hasNumber() {
        return this.currentState.number != -1;
    }

    public boolean isVisible() {
        return this.currentState.isVisible.booleanValue();
    }

    public void setAdditionalHorizontalOffset(int i10) {
        this.overridingState.additionalHorizontalOffset = Integer.valueOf(i10);
        this.currentState.additionalHorizontalOffset = Integer.valueOf(i10);
    }

    public void setAdditionalVerticalOffset(int i10) {
        this.overridingState.additionalVerticalOffset = Integer.valueOf(i10);
        this.currentState.additionalVerticalOffset = Integer.valueOf(i10);
    }

    public void setAlpha(int i10) {
        this.overridingState.alpha = i10;
        this.currentState.alpha = i10;
    }

    public void setBackgroundColor(int i10) {
        this.overridingState.backgroundColor = Integer.valueOf(i10);
        this.currentState.backgroundColor = Integer.valueOf(i10);
    }

    public void setBadgeGravity(int i10) {
        this.overridingState.badgeGravity = Integer.valueOf(i10);
        this.currentState.badgeGravity = Integer.valueOf(i10);
    }

    public void setBadgeTextColor(int i10) {
        this.overridingState.badgeTextColor = Integer.valueOf(i10);
        this.currentState.badgeTextColor = Integer.valueOf(i10);
    }

    public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int i10) {
        this.overridingState.contentDescriptionExceedsMaxBadgeNumberRes = i10;
        this.currentState.contentDescriptionExceedsMaxBadgeNumberRes = i10;
    }

    public void setContentDescriptionNumberless(CharSequence charSequence) {
        this.overridingState.contentDescriptionNumberless = charSequence;
        this.currentState.contentDescriptionNumberless = charSequence;
    }

    public void setContentDescriptionQuantityStringsResource(int i10) {
        this.overridingState.contentDescriptionQuantityStrings = i10;
        this.currentState.contentDescriptionQuantityStrings = i10;
    }

    public void setHorizontalOffsetWithText(int i10) {
        this.overridingState.horizontalOffsetWithText = Integer.valueOf(i10);
        this.currentState.horizontalOffsetWithText = Integer.valueOf(i10);
    }

    public void setHorizontalOffsetWithoutText(int i10) {
        this.overridingState.horizontalOffsetWithoutText = Integer.valueOf(i10);
        this.currentState.horizontalOffsetWithoutText = Integer.valueOf(i10);
    }

    public void setMaxCharacterCount(int i10) {
        this.overridingState.maxCharacterCount = i10;
        this.currentState.maxCharacterCount = i10;
    }

    public void setNumber(int i10) {
        this.overridingState.number = i10;
        this.currentState.number = i10;
    }

    public void setNumberLocale(Locale locale) {
        this.overridingState.numberLocale = locale;
        this.currentState.numberLocale = locale;
    }

    public void setVerticalOffsetWithText(int i10) {
        this.overridingState.verticalOffsetWithText = Integer.valueOf(i10);
        this.currentState.verticalOffsetWithText = Integer.valueOf(i10);
    }

    public void setVerticalOffsetWithoutText(int i10) {
        this.overridingState.verticalOffsetWithoutText = Integer.valueOf(i10);
        this.currentState.verticalOffsetWithoutText = Integer.valueOf(i10);
    }

    public void setVisible(boolean z10) {
        this.overridingState.isVisible = Boolean.valueOf(z10);
        this.currentState.isVisible = Boolean.valueOf(z10);
    }
}
