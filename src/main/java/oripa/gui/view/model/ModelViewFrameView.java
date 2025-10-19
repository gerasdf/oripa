/**
 * ORIPA - Origami Pattern Editor
 * Copyright (C) 2013-     ORIPA OSS Project  https://github.com/oripa/oripa
 * Copyright (C) 2005-2009 Jun Mitani         http://mitani.cs.tsukuba.ac.jp/

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package oripa.gui.view.model;

import java.beans.PropertyChangeListener;
import java.util.function.Consumer;

import oripa.domain.fold.halfedge.OrigamiModel;
import oripa.gui.view.FrameView;

/**
 * @author OUCHI Koji
 *
 */
public interface ModelViewFrameView extends FrameView {

	ModelViewScreenView getModelScreenView();

	void setModelCount(int count);

	void setModel(final OrigamiModel origamiModel);

	void putModelIndexChangeListener(final Object parentOfListener, final PropertyChangeListener listener);

	void removeModelIndexChangeListeners();

	void setOnCloseListener(final Consumer<FrameView> listener);

	void selectModel(final int index);

	void addFlipModelButtonListener(Runnable listener);

	void addCrossLineButtonListener(Runnable listener);

	void addExportDXFButtonListener(Runnable listener);

	void addExportOBJButtonListener(Runnable listener);

	void addExportSVGButtonListener(Runnable listener);

	void addFillAlphaButtonListener(Runnable listener);

	void addFillNoneButtonListener(Runnable listener);

	boolean isCrossLineVisible();

	void setModelDisplayMode(ModelDisplayMode mode);

	void addModelSwitchListener(Consumer<Integer> listener);

	void showExportErrorMessage(Exception e);
}
