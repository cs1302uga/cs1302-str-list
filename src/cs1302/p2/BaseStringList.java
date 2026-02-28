package cs1302.p2;

import cs1302.adt.StringList;

/**
 * An abstract parent class for {@link cs1302.adt.StringList} implementations.
 */
public abstract class BaseStringList implements StringList {

    // ------------------------------------------------------------------------------------------ //
    // INSTANCE VARIABLES
    // ------------------------------------------------------------------------------------------ //

    /**
     * The number of items stored by this string list.
     */
    protected int size;

    // ------------------------------------------------------------------------------------------ //
    // CONSTRUCTOR(S)
    // ------------------------------------------------------------------------------------------ //

    /**
     * Construct a new, empty {@link cs1302.p2.BaseStringList} object.
     */
    public BaseStringList() {
        super(); // call Object() constructor
        this.size = 0;
    } // BaseStringList

    // ------------------------------------------------------------------------------------------ //
    // OVERRIDES AND ADDITIONAL HELPER METHODS
    // ------------------------------------------------------------------------------------------ //

    // ...

} // BaseStringList
