package b8;

import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.content.res.loader.ResourcesLoader;
import android.graphics.Movie;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import fd.j0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes2.dex */
public class c extends Resources {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Resources f3357a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        j0.i(resources, "resources");
        this.f3357a = resources;
    }

    @Override // android.content.res.Resources
    public void addLoaders(ResourcesLoader... resourcesLoaderArr) {
        j0.i(resourcesLoaderArr, "loaders");
        this.f3357a.addLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i10) throws Resources.NotFoundException {
        XmlResourceParser animation = this.f3357a.getAnimation(i10);
        j0.h(animation, "resources.getAnimation(id)");
        return animation;
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i10) throws Resources.NotFoundException {
        return this.f3357a.getBoolean(i10);
    }

    @Override // android.content.res.Resources
    public int getColor(int i10) throws Resources.NotFoundException {
        return this.f3357a.getColor(i10);
    }

    @Override // android.content.res.Resources
    public int getColor(int i10, Resources.Theme theme) throws Resources.NotFoundException {
        return this.f3357a.getColor(i10, theme);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i10) throws Resources.NotFoundException {
        ColorStateList colorStateList = this.f3357a.getColorStateList(i10);
        j0.h(colorStateList, "resources.getColorStateList(id)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i10, Resources.Theme theme) throws Resources.NotFoundException {
        ColorStateList colorStateList = this.f3357a.getColorStateList(i10, theme);
        j0.h(colorStateList, "resources.getColorStateList(id, theme)");
        return colorStateList;
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f3357a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i10) throws Resources.NotFoundException {
        return this.f3357a.getDimension(i10);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i10) throws Resources.NotFoundException {
        return this.f3357a.getDimensionPixelOffset(i10);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i10) throws Resources.NotFoundException {
        return this.f3357a.getDimensionPixelSize(i10);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f3357a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10) throws Resources.NotFoundException {
        return this.f3357a.getDrawable(i10);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i10, Resources.Theme theme) throws Resources.NotFoundException {
        return this.f3357a.getDrawable(i10, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i10, int i11) throws Resources.NotFoundException {
        return this.f3357a.getDrawableForDensity(i10, i11);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i10, int i11, Resources.Theme theme) {
        return this.f3357a.getDrawableForDensity(i10, i11, theme);
    }

    @Override // android.content.res.Resources
    public float getFloat(int i10) throws Resources.NotFoundException {
        return this.f3357a.getFloat(i10);
    }

    @Override // android.content.res.Resources
    public Typeface getFont(int i10) throws Resources.NotFoundException {
        Typeface font = this.f3357a.getFont(i10);
        j0.h(font, "resources.getFont(id)");
        return font;
    }

    @Override // android.content.res.Resources
    public float getFraction(int i10, int i11, int i12) throws Resources.NotFoundException {
        return this.f3357a.getFraction(i10, i11, i12);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f3357a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i10) throws Resources.NotFoundException {
        int[] intArray = this.f3357a.getIntArray(i10);
        j0.h(intArray, "resources.getIntArray(id)");
        return intArray;
    }

    @Override // android.content.res.Resources
    public int getInteger(int i10) throws Resources.NotFoundException {
        return this.f3357a.getInteger(i10);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i10) throws Resources.NotFoundException {
        XmlResourceParser layout = this.f3357a.getLayout(i10);
        j0.h(layout, "resources.getLayout(id)");
        return layout;
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i10) throws Resources.NotFoundException {
        return this.f3357a.getMovie(i10);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i10, int i11) throws Resources.NotFoundException {
        String quantityString = this.f3357a.getQuantityString(i10, i11);
        j0.h(quantityString, "resources.getQuantityString(id, quantity)");
        return quantityString;
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i10, int i11, Object... objArr) throws Resources.NotFoundException {
        j0.i(objArr, "formatArgs");
        String quantityString = this.f3357a.getQuantityString(i10, i11, Arrays.copyOf(objArr, objArr.length));
        j0.h(quantityString, "resources.getQuantityStr…d, quantity, *formatArgs)");
        return quantityString;
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i10, int i11) throws Resources.NotFoundException {
        CharSequence quantityText = this.f3357a.getQuantityText(i10, i11);
        j0.h(quantityText, "resources.getQuantityText(id, quantity)");
        return quantityText;
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i10) throws Resources.NotFoundException {
        return this.f3357a.getResourceEntryName(i10);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i10) throws Resources.NotFoundException {
        return this.f3357a.getResourceName(i10);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i10) throws Resources.NotFoundException {
        return this.f3357a.getResourcePackageName(i10);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i10) throws Resources.NotFoundException {
        return this.f3357a.getResourceTypeName(i10);
    }

    @Override // android.content.res.Resources
    public String getString(int i10) throws Resources.NotFoundException {
        String string = this.f3357a.getString(i10);
        j0.h(string, "resources.getString(id)");
        return string;
    }

    @Override // android.content.res.Resources
    public String getString(int i10, Object... objArr) throws Resources.NotFoundException {
        j0.i(objArr, "formatArgs");
        String string = this.f3357a.getString(i10, Arrays.copyOf(objArr, objArr.length));
        j0.h(string, "resources.getString(id, *formatArgs)");
        return string;
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i10) throws Resources.NotFoundException {
        String[] stringArray = this.f3357a.getStringArray(i10);
        j0.h(stringArray, "resources.getStringArray(id)");
        return stringArray;
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i10) throws Resources.NotFoundException {
        CharSequence text = this.f3357a.getText(i10);
        j0.h(text, "resources.getText(id)");
        return text;
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i10, CharSequence charSequence) {
        return this.f3357a.getText(i10, charSequence);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i10) throws Resources.NotFoundException {
        CharSequence[] textArray = this.f3357a.getTextArray(i10);
        j0.h(textArray, "resources.getTextArray(id)");
        return textArray;
    }

    @Override // android.content.res.Resources
    public void getValue(int i10, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.f3357a.getValue(i10, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.f3357a.getValue(str, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i10, int i11, TypedValue typedValue, boolean z10) throws Resources.NotFoundException {
        this.f3357a.getValueForDensity(i10, i11, typedValue, z10);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i10) throws Resources.NotFoundException {
        XmlResourceParser xml = this.f3357a.getXml(i10);
        j0.h(xml, "resources.getXml(id)");
        return xml;
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f3357a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i10) throws Resources.NotFoundException {
        TypedArray typedArrayObtainTypedArray = this.f3357a.obtainTypedArray(i10);
        j0.h(typedArrayObtainTypedArray, "resources.obtainTypedArray(id)");
        return typedArrayObtainTypedArray;
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i10) throws Resources.NotFoundException {
        InputStream inputStreamOpenRawResource = this.f3357a.openRawResource(i10);
        j0.h(inputStreamOpenRawResource, "resources.openRawResource(id)");
        return inputStreamOpenRawResource;
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i10, TypedValue typedValue) throws Resources.NotFoundException {
        InputStream inputStreamOpenRawResource = this.f3357a.openRawResource(i10, typedValue);
        j0.h(inputStreamOpenRawResource, "resources.openRawResource(id, value)");
        return inputStreamOpenRawResource;
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i10) throws Resources.NotFoundException {
        return this.f3357a.openRawResourceFd(i10);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f3357a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f3357a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void removeLoaders(ResourcesLoader... resourcesLoaderArr) {
        j0.i(resourcesLoaderArr, "loaders");
        this.f3357a.removeLoaders((ResourcesLoader[]) Arrays.copyOf(resourcesLoaderArr, resourcesLoaderArr.length));
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f3357a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }
}
