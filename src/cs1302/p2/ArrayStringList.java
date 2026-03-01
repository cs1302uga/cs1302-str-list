package cs1302.p2;

import cs1302.adt.StringList;

/**
 * A {@link cs1302.adt.StringList} implementation that internally uses
 * a simple array to store its items.
 */
public class ArrayStringList extends BaseStringList {

    // ------------------------------------------------------------------------------------------ //
    // INSTANCE VARIABLES
    // ------------------------------------------------------------------------------------------ //

    /**
     * Reference to the storage array.
     */
    private String[] items;

    // ------------------------------------------------------------------------------------------ //
    // CONSTRUCTOR(S)
    // ------------------------------------------------------------------------------------------ //

    /**
     * Construct a new, empty {@link cs1302.p2.ArrayStringList} object.
     */
    public ArrayStringList() {
        super(); // call BaseStringList() constructor
        this.items = new String[3]; // initial capacity based on the textbook reading
    } // ArrayStringList

    // ------------------------------------------------------------------------------------------ //
    // OVERRIDES AND ADDITIONAL HELPER METHODS
    // ------------------------------------------------------------------------------------------ //

    // ...

} // ArrayStringList
