/*
 * Copyright (c) 2005, 2013, Oracle and/or its affiliates. All rights reserved.
 * ORACLE PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 *
 */

package com.sun.source.tree;

import javax.lang.model.element.Name;
import java.util.List;

/**
 * A tree node for a type parameter.
 * <p>
 * For example:
 * <pre>
 *   <em>name</em>
 *
 *   <em>name</em> extends <em>bounds</em>
 *
 *   <em>annotations</em> <em>name</em>
 * </pre>
 *
 * @author Peter von der Ah&eacute;
 * @author Jonathan Gibbons
 * @jls section 4.4
 * @since 1.6
 */
@jdk.Exported
public interface TypeParameterTree extends Tree {
    Name getName();

    List<? extends Tree> getBounds();

    /**
     * Return annotations on the type parameter declaration.
     * <p>
     * Annotations need Target meta-annotations of
     * {@link java.lang.annotation.ElementType#TYPE_PARAMETER} or
     * {@link java.lang.annotation.ElementType#TYPE_USE}
     * to appear in this position.
     *
     * @return annotations on the type parameter declaration
     * @since 1.8
     */
    List<? extends AnnotationTree> getAnnotations();
}