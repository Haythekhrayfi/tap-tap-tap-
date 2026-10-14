package androidx.appcompat.view.menu;

import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import okhttp3.internal.http2.Settings;
import p0.g0;

/* JADX INFO: loaded from: classes.dex */
public class e implements j0.a {
    private static final String ACTION_VIEW_STATES_KEY = "android:menu:actionviewstates";
    private static final String EXPANDED_ACTION_VIEW_ID = "android:menu:expandedactionview";
    private static final String PRESENTER_KEY = "android:menu:presenters";
    private static final String TAG = "MenuBuilder";
    private static final int[] sCategoryToOrder = {1, 4, 5, 3, 2, 0};
    private a mCallback;
    private final Context mContext;
    private ContextMenu.ContextMenuInfo mCurrentMenuInfo;
    private g mExpandedItem;
    public Drawable mHeaderIcon;
    public CharSequence mHeaderTitle;
    public View mHeaderView;
    private boolean mOverrideVisibleItems;
    private boolean mQwertyMode;
    private final Resources mResources;
    private boolean mShortcutsVisible;
    private int mDefaultShowAsAction = 0;
    private boolean mPreventDispatchingItemsChanged = false;
    private boolean mItemsChangedWhileDispatchPrevented = false;
    private boolean mStructureChangedWhileDispatchPrevented = false;
    private boolean mOptionalIconsVisible = false;
    private boolean mIsClosing = false;
    private ArrayList<g> mTempShortcutItemList = new ArrayList<>();
    private CopyOnWriteArrayList<WeakReference<i>> mPresenters = new CopyOnWriteArrayList<>();
    private boolean mGroupDividerEnabled = false;
    private ArrayList<g> mItems = new ArrayList<>();
    private ArrayList<g> mVisibleItems = new ArrayList<>();
    private boolean mIsVisibleItemsStale = true;
    private ArrayList<g> mActionItems = new ArrayList<>();
    private ArrayList<g> mNonActionItems = new ArrayList<>();
    private boolean mIsActionItemsStale = true;

    public interface a {
        boolean onMenuItemSelected(e eVar, MenuItem menuItem);

        void onMenuModeChange(e eVar);
    }

    public interface b {
        boolean a(g gVar);
    }

    public e(Context context) {
        this.mContext = context;
        this.mResources = context.getResources();
        setShortcutsVisibleInner(true);
    }

    private g createNewMenuItem(int i10, int i11, int i12, int i13, CharSequence charSequence, int i14) {
        return new g(this, i10, i11, i12, i13, charSequence, i14);
    }

    private void dispatchPresenterUpdate(boolean z10) {
        if (this.mPresenters.isEmpty()) {
            return;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<i> weakReference : this.mPresenters) {
            i iVar = weakReference.get();
            if (iVar == null) {
                this.mPresenters.remove(weakReference);
            } else {
                iVar.updateMenuView(z10);
            }
        }
        startDispatchingItemsChanged();
    }

    private void dispatchRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(PRESENTER_KEY);
        if (sparseParcelableArray == null || this.mPresenters.isEmpty()) {
            return;
        }
        for (WeakReference<i> weakReference : this.mPresenters) {
            i iVar = weakReference.get();
            if (iVar == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id2 = iVar.getId();
                if (id2 > 0 && (parcelable = (Parcelable) sparseParcelableArray.get(id2)) != null) {
                    iVar.onRestoreInstanceState(parcelable);
                }
            }
        }
    }

    private void dispatchSaveInstanceState(Bundle bundle) {
        Parcelable parcelableOnSaveInstanceState;
        if (this.mPresenters.isEmpty()) {
            return;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<i> weakReference : this.mPresenters) {
            i iVar = weakReference.get();
            if (iVar == null) {
                this.mPresenters.remove(weakReference);
            } else {
                int id2 = iVar.getId();
                if (id2 > 0 && (parcelableOnSaveInstanceState = iVar.onSaveInstanceState()) != null) {
                    sparseArray.put(id2, parcelableOnSaveInstanceState);
                }
            }
        }
        bundle.putSparseParcelableArray(PRESENTER_KEY, sparseArray);
    }

    private boolean dispatchSubMenuSelected(l lVar, i iVar) {
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        boolean zOnSubMenuSelected = iVar != null ? iVar.onSubMenuSelected(lVar) : false;
        for (WeakReference<i> weakReference : this.mPresenters) {
            i iVar2 = weakReference.get();
            if (iVar2 == null) {
                this.mPresenters.remove(weakReference);
            } else if (!zOnSubMenuSelected) {
                zOnSubMenuSelected = iVar2.onSubMenuSelected(lVar);
            }
        }
        return zOnSubMenuSelected;
    }

    private static int findInsertIndex(ArrayList<g> arrayList, int i10) {
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            if (arrayList.get(size).f860d <= i10) {
                return size + 1;
            }
        }
        return 0;
    }

    private static int getOrdering(int i10) {
        int i11 = ((-65536) & i10) >> 16;
        if (i11 >= 0) {
            int[] iArr = sCategoryToOrder;
            if (i11 < iArr.length) {
                return (i10 & Settings.DEFAULT_INITIAL_WINDOW_SIZE) | (iArr[i11] << 16);
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    private void removeItemAtInt(int i10, boolean z10) {
        if (i10 < 0 || i10 >= this.mItems.size()) {
            return;
        }
        this.mItems.remove(i10);
        if (z10) {
            onItemsChanged(true);
        }
    }

    private void setHeaderInternal(int i10, CharSequence charSequence, int i11, Drawable drawable, View view) {
        Resources resources = getResources();
        if (view != null) {
            this.mHeaderView = view;
            this.mHeaderTitle = null;
            this.mHeaderIcon = null;
        } else {
            if (i10 > 0) {
                this.mHeaderTitle = resources.getText(i10);
            } else if (charSequence != null) {
                this.mHeaderTitle = charSequence;
            }
            if (i11 > 0) {
                Context context = getContext();
                Object obj = e0.a.f28964a;
                this.mHeaderIcon = e0.a.c.b(context, i11);
            } else if (drawable != null) {
                this.mHeaderIcon = drawable;
            }
            this.mHeaderView = null;
        }
        onItemsChanged(false);
    }

    private void setShortcutsVisibleInner(boolean z10) {
        boolean zB;
        boolean z11 = false;
        if (z10 && this.mResources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(this.mContext);
            Context context = this.mContext;
            Method method = g0.f34378a;
            if (Build.VERSION.SDK_INT >= 28) {
                zB = g0.b.b(viewConfiguration);
            } else {
                Resources resources = context.getResources();
                int identifier = resources.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                zB = identifier != 0 && resources.getBoolean(identifier);
            }
            if (zB) {
                z11 = true;
            }
        }
        this.mShortcutsVisible = z11;
    }

    @Override // android.view.Menu
    public MenuItem add(int i10) {
        return addInternal(0, 0, 0, this.mResources.getString(i10));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, int i13) {
        return addInternal(i10, i11, i12, this.mResources.getString(i13));
    }

    @Override // android.view.Menu
    public MenuItem add(int i10, int i11, int i12, CharSequence charSequence) {
        return addInternal(i10, i11, i12, charSequence);
    }

    @Override // android.view.Menu
    public MenuItem add(CharSequence charSequence) {
        return addInternal(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public int addIntentOptions(int i10, int i11, int i12, ComponentName componentName, Intent[] intentArr, Intent intent, int i13, MenuItem[] menuItemArr) {
        int i14;
        PackageManager packageManager = this.mContext.getPackageManager();
        List<ResolveInfo> listQueryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        int size = listQueryIntentActivityOptions != null ? listQueryIntentActivityOptions.size() : 0;
        if ((i13 & 1) == 0) {
            removeGroup(i10);
        }
        for (int i15 = 0; i15 < size; i15++) {
            ResolveInfo resolveInfo = listQueryIntentActivityOptions.get(i15);
            int i16 = resolveInfo.specificIndex;
            Intent intent2 = new Intent(i16 < 0 ? intent : intentArr[i16]);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent2.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            MenuItem intent3 = add(i10, i11, i12, resolveInfo.loadLabel(packageManager)).setIcon(resolveInfo.loadIcon(packageManager)).setIntent(intent2);
            if (menuItemArr != null && (i14 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i14] = intent3;
            }
        }
        return size;
    }

    public MenuItem addInternal(int i10, int i11, int i12, CharSequence charSequence) {
        int ordering = getOrdering(i12);
        g gVarCreateNewMenuItem = createNewMenuItem(i10, i11, i12, ordering, charSequence, this.mDefaultShowAsAction);
        ContextMenu.ContextMenuInfo contextMenuInfo = this.mCurrentMenuInfo;
        if (contextMenuInfo != null) {
            gVarCreateNewMenuItem.D = contextMenuInfo;
        }
        ArrayList<g> arrayList = this.mItems;
        arrayList.add(findInsertIndex(arrayList, ordering), gVarCreateNewMenuItem);
        onItemsChanged(true);
        return gVarCreateNewMenuItem;
    }

    public void addMenuPresenter(i iVar) {
        addMenuPresenter(iVar, this.mContext);
    }

    public void addMenuPresenter(i iVar, Context context) {
        this.mPresenters.add(new WeakReference<>(iVar));
        iVar.initForMenu(context, this);
        this.mIsActionItemsStale = true;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10) {
        return addSubMenu(0, 0, 0, this.mResources.getString(i10));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, int i13) {
        return addSubMenu(i10, i11, i12, this.mResources.getString(i13));
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i10, int i11, int i12, CharSequence charSequence) {
        g gVar = (g) addInternal(i10, i11, i12, charSequence);
        l lVar = new l(this.mContext, this, gVar);
        gVar.f871o = lVar;
        lVar.setHeaderTitle(gVar.f861e);
        return lVar;
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void changeMenuMode() {
        a aVar = this.mCallback;
        if (aVar != null) {
            aVar.onMenuModeChange(this);
        }
    }

    @Override // android.view.Menu
    public void clear() {
        g gVar = this.mExpandedItem;
        if (gVar != null) {
            collapseItemActionView(gVar);
        }
        this.mItems.clear();
        onItemsChanged(true);
    }

    public void clearAll() {
        this.mPreventDispatchingItemsChanged = true;
        clear();
        clearHeader();
        this.mPresenters.clear();
        this.mPreventDispatchingItemsChanged = false;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
        onItemsChanged(true);
    }

    public void clearHeader() {
        this.mHeaderIcon = null;
        this.mHeaderTitle = null;
        this.mHeaderView = null;
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public void close() {
        close(true);
    }

    public final void close(boolean z10) {
        if (this.mIsClosing) {
            return;
        }
        this.mIsClosing = true;
        for (WeakReference<i> weakReference : this.mPresenters) {
            i iVar = weakReference.get();
            if (iVar == null) {
                this.mPresenters.remove(weakReference);
            } else {
                iVar.onCloseMenu(this, z10);
            }
        }
        this.mIsClosing = false;
    }

    public boolean collapseItemActionView(g gVar) {
        boolean zCollapseItemActionView = false;
        if (!this.mPresenters.isEmpty() && this.mExpandedItem == gVar) {
            stopDispatchingItemsChanged();
            for (WeakReference<i> weakReference : this.mPresenters) {
                i iVar = weakReference.get();
                if (iVar != null) {
                    zCollapseItemActionView = iVar.collapseItemActionView(this, gVar);
                    if (zCollapseItemActionView) {
                        break;
                    }
                } else {
                    this.mPresenters.remove(weakReference);
                }
            }
            startDispatchingItemsChanged();
            if (zCollapseItemActionView) {
                this.mExpandedItem = null;
            }
        }
        return zCollapseItemActionView;
    }

    public boolean dispatchMenuItemSelected(e eVar, MenuItem menuItem) {
        a aVar = this.mCallback;
        return aVar != null && aVar.onMenuItemSelected(eVar, menuItem);
    }

    public boolean expandItemActionView(g gVar) {
        boolean zExpandItemActionView = false;
        if (this.mPresenters.isEmpty()) {
            return false;
        }
        stopDispatchingItemsChanged();
        for (WeakReference<i> weakReference : this.mPresenters) {
            i iVar = weakReference.get();
            if (iVar != null) {
                zExpandItemActionView = iVar.expandItemActionView(this, gVar);
                if (zExpandItemActionView) {
                    break;
                }
            } else {
                this.mPresenters.remove(weakReference);
            }
        }
        startDispatchingItemsChanged();
        if (zExpandItemActionView) {
            this.mExpandedItem = gVar;
        }
        return zExpandItemActionView;
    }

    public int findGroupIndex(int i10) {
        return findGroupIndex(i10, 0);
    }

    public int findGroupIndex(int i10, int i11) {
        int size = size();
        if (i11 < 0) {
            i11 = 0;
        }
        while (i11 < size) {
            if (this.mItems.get(i11).f858b == i10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Override // android.view.Menu
    public MenuItem findItem(int i10) {
        MenuItem menuItemFindItem;
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.mItems.get(i11);
            if (gVar.f857a == i10) {
                return gVar;
            }
            if (gVar.hasSubMenu() && (menuItemFindItem = gVar.f871o.findItem(i10)) != null) {
                return menuItemFindItem;
            }
        }
        return null;
    }

    public int findItemIndex(int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            if (this.mItems.get(i11).f857a == i10) {
                return i11;
            }
        }
        return -1;
    }

    public g findItemWithShortcutForKey(int i10, KeyEvent keyEvent) {
        ArrayList<g> arrayList = this.mTempShortcutItemList;
        arrayList.clear();
        findItemsWithShortcutForKey(arrayList, i10, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean zIsQwertyMode = isQwertyMode();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = arrayList.get(i11);
            char c10 = zIsQwertyMode ? gVar.f866j : gVar.f864h;
            char[] cArr = keyData.meta;
            if ((c10 == cArr[0] && (metaState & 2) == 0) || ((c10 == cArr[2] && (metaState & 2) != 0) || (zIsQwertyMode && c10 == '\b' && i10 == 67))) {
                return gVar;
            }
        }
        return null;
    }

    public void findItemsWithShortcutForKey(List<g> list, int i10, KeyEvent keyEvent) {
        boolean zIsQwertyMode = isQwertyMode();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i10 == 67) {
            int size = this.mItems.size();
            for (int i11 = 0; i11 < size; i11++) {
                g gVar = this.mItems.get(i11);
                if (gVar.hasSubMenu()) {
                    gVar.f871o.findItemsWithShortcutForKey(list, i10, keyEvent);
                }
                char c10 = zIsQwertyMode ? gVar.f866j : gVar.f864h;
                if (((modifiers & 69647) == ((zIsQwertyMode ? gVar.f867k : gVar.f865i) & 69647)) && c10 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c10 == cArr[0] || c10 == cArr[2] || (zIsQwertyMode && c10 == '\b' && i10 == 67)) && gVar.isEnabled()) {
                        list.add(gVar);
                    }
                }
            }
        }
    }

    public void flagActionItems() {
        ArrayList<g> visibleItems = getVisibleItems();
        if (this.mIsActionItemsStale) {
            boolean zFlagActionItems = false;
            for (WeakReference<i> weakReference : this.mPresenters) {
                i iVar = weakReference.get();
                if (iVar == null) {
                    this.mPresenters.remove(weakReference);
                } else {
                    zFlagActionItems |= iVar.flagActionItems();
                }
            }
            if (zFlagActionItems) {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                int size = visibleItems.size();
                for (int i10 = 0; i10 < size; i10++) {
                    g gVar = visibleItems.get(i10);
                    (gVar.g() ? this.mActionItems : this.mNonActionItems).add(gVar);
                }
            } else {
                this.mActionItems.clear();
                this.mNonActionItems.clear();
                this.mNonActionItems.addAll(getVisibleItems());
            }
            this.mIsActionItemsStale = false;
        }
    }

    public ArrayList<g> getActionItems() {
        flagActionItems();
        return this.mActionItems;
    }

    public String getActionViewStatesKey() {
        return ACTION_VIEW_STATES_KEY;
    }

    public Context getContext() {
        return this.mContext;
    }

    public g getExpandedItem() {
        return this.mExpandedItem;
    }

    public Drawable getHeaderIcon() {
        return this.mHeaderIcon;
    }

    public CharSequence getHeaderTitle() {
        return this.mHeaderTitle;
    }

    public View getHeaderView() {
        return this.mHeaderView;
    }

    @Override // android.view.Menu
    public MenuItem getItem(int i10) {
        return this.mItems.get(i10);
    }

    public ArrayList<g> getNonActionItems() {
        flagActionItems();
        return this.mNonActionItems;
    }

    public boolean getOptionalIconsVisible() {
        return this.mOptionalIconsVisible;
    }

    public Resources getResources() {
        return this.mResources;
    }

    public e getRootMenu() {
        return this;
    }

    public ArrayList<g> getVisibleItems() {
        if (!this.mIsVisibleItemsStale) {
            return this.mVisibleItems;
        }
        this.mVisibleItems.clear();
        int size = this.mItems.size();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.mItems.get(i10);
            if (gVar.isVisible()) {
                this.mVisibleItems.add(gVar);
            }
        }
        this.mIsVisibleItemsStale = false;
        this.mIsActionItemsStale = true;
        return this.mVisibleItems;
    }

    @Override // android.view.Menu
    public boolean hasVisibleItems() {
        if (this.mOverrideVisibleItems) {
            return true;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.mItems.get(i10).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public boolean isGroupDividerEnabled() {
        return this.mGroupDividerEnabled;
    }

    public boolean isQwertyMode() {
        return this.mQwertyMode;
    }

    @Override // android.view.Menu
    public boolean isShortcutKey(int i10, KeyEvent keyEvent) {
        return findItemWithShortcutForKey(i10, keyEvent) != null;
    }

    public boolean isShortcutsVisible() {
        return this.mShortcutsVisible;
    }

    public void onItemActionRequestChanged(g gVar) {
        this.mIsActionItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemVisibleChanged(g gVar) {
        this.mIsVisibleItemsStale = true;
        onItemsChanged(true);
    }

    public void onItemsChanged(boolean z10) {
        if (this.mPreventDispatchingItemsChanged) {
            this.mItemsChangedWhileDispatchPrevented = true;
            if (z10) {
                this.mStructureChangedWhileDispatchPrevented = true;
                return;
            }
            return;
        }
        if (z10) {
            this.mIsVisibleItemsStale = true;
            this.mIsActionItemsStale = true;
        }
        dispatchPresenterUpdate(z10);
    }

    @Override // android.view.Menu
    public boolean performIdentifierAction(int i10, int i11) {
        return performItemAction(findItem(i10), i11);
    }

    public boolean performItemAction(MenuItem menuItem, int i10) {
        return performItemAction(menuItem, null, i10);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0021  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:35:0x005a  */
    /* JADX WARN: Code duplicated, block: B:37:0x0061 A[PHI: r1
  0x0061: PHI (r1v14 boolean) = (r1v12 boolean), (r1v11 boolean), (r1v15 boolean) binds: [B:55:0x009c, B:43:0x0070, B:36:0x005f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x0077  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    public boolean performItemAction(MenuItem menuItem, i iVar, int i10) {
        p0.b bVar;
        boolean zDispatchSubMenuSelected;
        p0.b bVar2;
        boolean z10;
        l lVar;
        g gVar = (g) menuItem;
        if (gVar == null || !gVar.isEnabled()) {
            return false;
        }
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = gVar.f872p;
        if (onMenuItemClickListener == null || !onMenuItemClickListener.onMenuItemClick(gVar)) {
            e eVar = gVar.f870n;
            if (eVar.dispatchMenuItemSelected(eVar, gVar)) {
                zDispatchSubMenuSelected = true;
            } else if (gVar.f863g != null) {
                try {
                    gVar.f870n.getContext().startActivity(gVar.f863g);
                } catch (ActivityNotFoundException e10) {
                    Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e10);
                    bVar = gVar.A;
                    if (bVar == null) {
                    }
                    zDispatchSubMenuSelected = false;
                    bVar2 = gVar.A;
                    if (bVar2 == null) {
                        z10 = false;
                    } else {
                        z10 = false;
                    }
                    if (gVar.f()) {
                        zDispatchSubMenuSelected |= gVar.expandActionView();
                        if (zDispatchSubMenuSelected) {
                            close(true);
                        }
                    } else if (gVar.hasSubMenu()) {
                        if ((i10 & 4) == 0) {
                            close(false);
                        }
                        if (!gVar.hasSubMenu()) {
                            l lVar2 = new l(getContext(), this, gVar);
                            gVar.f871o = lVar2;
                            lVar2.setHeaderTitle(gVar.f861e);
                        }
                        lVar = gVar.f871o;
                        if (z10) {
                            bVar2.f(lVar);
                        }
                        zDispatchSubMenuSelected |= dispatchSubMenuSelected(lVar, iVar);
                        if (!zDispatchSubMenuSelected) {
                            close(true);
                        }
                    } else {
                        if ((i10 & 4) == 0) {
                            close(false);
                        }
                        if (!gVar.hasSubMenu()) {
                            l lVar3 = new l(getContext(), this, gVar);
                            gVar.f871o = lVar3;
                            lVar3.setHeaderTitle(gVar.f861e);
                        }
                        lVar = gVar.f871o;
                        if (z10) {
                            bVar2.f(lVar);
                        }
                        zDispatchSubMenuSelected |= dispatchSubMenuSelected(lVar, iVar);
                        if (!zDispatchSubMenuSelected) {
                            close(true);
                        }
                    }
                    return zDispatchSubMenuSelected;
                }
                zDispatchSubMenuSelected = true;
            } else {
                bVar = gVar.A;
                if (bVar == null && bVar.e()) {
                    zDispatchSubMenuSelected = true;
                } else {
                    zDispatchSubMenuSelected = false;
                }
            }
        } else {
            zDispatchSubMenuSelected = true;
        }
        bVar2 = gVar.A;
        if (bVar2 == null && bVar2.a()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (gVar.f()) {
            zDispatchSubMenuSelected |= gVar.expandActionView();
            if (zDispatchSubMenuSelected) {
                close(true);
            }
        } else if (gVar.hasSubMenu() || z10) {
            if ((i10 & 4) == 0) {
                close(false);
            }
            if (!gVar.hasSubMenu()) {
                l lVar4 = new l(getContext(), this, gVar);
                gVar.f871o = lVar4;
                lVar4.setHeaderTitle(gVar.f861e);
            }
            lVar = gVar.f871o;
            if (z10) {
                bVar2.f(lVar);
            }
            zDispatchSubMenuSelected |= dispatchSubMenuSelected(lVar, iVar);
            if (!zDispatchSubMenuSelected) {
                close(true);
            }
        } else if ((i10 & 1) == 0) {
            close(true);
        }
        return zDispatchSubMenuSelected;
    }

    @Override // android.view.Menu
    public boolean performShortcut(int i10, KeyEvent keyEvent, int i11) {
        g gVarFindItemWithShortcutForKey = findItemWithShortcutForKey(i10, keyEvent);
        boolean zPerformItemAction = gVarFindItemWithShortcutForKey != null ? performItemAction(gVarFindItemWithShortcutForKey, i11) : false;
        if ((i11 & 2) != 0) {
            close(true);
        }
        return zPerformItemAction;
    }

    @Override // android.view.Menu
    public void removeGroup(int i10) {
        int iFindGroupIndex = findGroupIndex(i10);
        if (iFindGroupIndex >= 0) {
            int size = this.mItems.size() - iFindGroupIndex;
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                if (i11 >= size || this.mItems.get(iFindGroupIndex).f858b != i10) {
                    break;
                }
                removeItemAtInt(iFindGroupIndex, false);
                i11 = i12;
            }
            onItemsChanged(true);
        }
    }

    @Override // android.view.Menu
    public void removeItem(int i10) {
        removeItemAtInt(findItemIndex(i10), true);
    }

    public void removeItemAt(int i10) {
        removeItemAtInt(i10, true);
    }

    public void removeMenuPresenter(i iVar) {
        for (WeakReference<i> weakReference : this.mPresenters) {
            i iVar2 = weakReference.get();
            if (iVar2 == null || iVar2 == iVar) {
                this.mPresenters.remove(weakReference);
            }
        }
    }

    public void restoreActionViewStates(Bundle bundle) {
        MenuItem menuItemFindItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(getActionViewStatesKey());
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).restoreActionViewStates(bundle);
            }
        }
        int i11 = bundle.getInt(EXPANDED_ACTION_VIEW_ID);
        if (i11 <= 0 || (menuItemFindItem = findItem(i11)) == null) {
            return;
        }
        menuItemFindItem.expandActionView();
    }

    public void restorePresenterStates(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveActionViewStates(Bundle bundle) {
        int size = size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i10 = 0; i10 < size; i10++) {
            MenuItem item = getItem(i10);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt(EXPANDED_ACTION_VIEW_ID, item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((l) item.getSubMenu()).saveActionViewStates(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(getActionViewStatesKey(), sparseArray);
        }
    }

    public void savePresenterStates(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setCallback(a aVar) {
        this.mCallback = aVar;
    }

    public void setCurrentMenuInfo(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.mCurrentMenuInfo = contextMenuInfo;
    }

    public e setDefaultShowAsAction(int i10) {
        this.mDefaultShowAsAction = i10;
        return this;
    }

    public void setExclusiveItemChecked(MenuItem menuItem) {
        int groupId = menuItem.getGroupId();
        int size = this.mItems.size();
        stopDispatchingItemsChanged();
        for (int i10 = 0; i10 < size; i10++) {
            g gVar = this.mItems.get(i10);
            if (gVar.f858b == groupId && gVar.h() && gVar.isCheckable()) {
                gVar.j(gVar == menuItem);
            }
        }
        startDispatchingItemsChanged();
    }

    @Override // android.view.Menu
    public void setGroupCheckable(int i10, boolean z10, boolean z11) {
        int size = this.mItems.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.mItems.get(i11);
            if (gVar.f858b == i10) {
                gVar.k(z11);
                gVar.setCheckable(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z10) {
        this.mGroupDividerEnabled = z10;
    }

    @Override // android.view.Menu
    public void setGroupEnabled(int i10, boolean z10) {
        int size = this.mItems.size();
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.mItems.get(i11);
            if (gVar.f858b == i10) {
                gVar.setEnabled(z10);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupVisible(int i10, boolean z10) {
        int size = this.mItems.size();
        boolean z11 = false;
        for (int i11 = 0; i11 < size; i11++) {
            g gVar = this.mItems.get(i11);
            if (gVar.f858b == i10 && gVar.m(z10)) {
                z11 = true;
            }
        }
        if (z11) {
            onItemsChanged(true);
        }
    }

    public e setHeaderIconInt(int i10) {
        setHeaderInternal(0, null, i10, null, null);
        return this;
    }

    public e setHeaderIconInt(Drawable drawable) {
        setHeaderInternal(0, null, 0, drawable, null);
        return this;
    }

    public e setHeaderTitleInt(int i10) {
        setHeaderInternal(i10, null, 0, null, null);
        return this;
    }

    public e setHeaderTitleInt(CharSequence charSequence) {
        setHeaderInternal(0, charSequence, 0, null, null);
        return this;
    }

    public e setHeaderViewInt(View view) {
        setHeaderInternal(0, null, 0, null, view);
        return this;
    }

    public void setOptionalIconsVisible(boolean z10) {
        this.mOptionalIconsVisible = z10;
    }

    public void setOverrideVisibleItems(boolean z10) {
        this.mOverrideVisibleItems = z10;
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z10) {
        this.mQwertyMode = z10;
        onItemsChanged(false);
    }

    public void setShortcutsVisible(boolean z10) {
        if (this.mShortcutsVisible == z10) {
            return;
        }
        setShortcutsVisibleInner(z10);
        onItemsChanged(false);
    }

    @Override // android.view.Menu
    public int size() {
        return this.mItems.size();
    }

    public void startDispatchingItemsChanged() {
        this.mPreventDispatchingItemsChanged = false;
        if (this.mItemsChangedWhileDispatchPrevented) {
            this.mItemsChangedWhileDispatchPrevented = false;
            onItemsChanged(this.mStructureChangedWhileDispatchPrevented);
        }
    }

    public void stopDispatchingItemsChanged() {
        if (this.mPreventDispatchingItemsChanged) {
            return;
        }
        this.mPreventDispatchingItemsChanged = true;
        this.mItemsChangedWhileDispatchPrevented = false;
        this.mStructureChangedWhileDispatchPrevented = false;
    }
}
