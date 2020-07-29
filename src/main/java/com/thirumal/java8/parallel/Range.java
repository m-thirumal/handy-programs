/**
 * 
 */
package com.thirumal.java8.parallel;

import java.util.Iterator;

/**
 * @author Thirumal
 *
 */
class Range

{

  public static Iterable

    

      range( final int start, final int stop, final int step )

  {

    if ( step <= 0 )

      throw new IllegalArgumentException( "step > 0 isrequired!" );

    return new Iterable

     

      ()

    {

      public Iterator

      

        iterator()

      {

        return new Iterator

       

        ()

        {

          private int counter = start;

          public boolean hasNext()

          {

            return counter < stop;

          }

          public Integer next()

          {

            try

            {

              return counter;

            }

            finally { counter += step; }

          }

          public void remove() { }

        };

      }

    };

  }

  public static Iterable

        

          range( final int start, final int stop )

  {

    return range( start, stop, 1 );

  }

  public static Iterable

         

           range( final int stop )

  {

    return range( 0, stop, 1 );

  }

}
