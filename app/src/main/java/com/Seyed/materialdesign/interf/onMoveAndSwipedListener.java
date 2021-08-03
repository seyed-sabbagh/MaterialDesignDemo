/*
 * Created by Seyed on 8/3/21, 2:09 PM
 * Copyright (c) 2021 . All rights reserved.
 * Last modified 8/3/21, 12:09 PM
 */

package com.Seyed.materialdesign.interf;

/**
 * Created by zhang on 2016.08.21.
 */
public interface onMoveAndSwipedListener {

    boolean onItemMove(int fromPosition, int toPosition);

    void onItemDismiss(int position);

}
