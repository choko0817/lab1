
   public class Stack
    {
        private int count, size;
        private int[] array;

        public Stack(int n)
        {
            array = new int[n];
            size = n;
            count = 0;
        }

        public boolean isFull()
        {
            return count == size;
        }

        public boolean isEmpty()
        {
            return count == 0;
        }

        public void push(int value)
        {
            if (!isFull())
            {
                array[count++] = value; 
            }
        }

        public int pop()
        {
            if (!isEmpty())
                return array[--count];
            else
                //return -1;
            //return default(int);
            	return -1;
        }

        public int top()
        {
            if (!isEmpty())
                return array[count-1];
            else
                //return -1;
                //return default(int);
            	  return -1;
        }

        public String toString()
        {
            String s = "";
            for (int i = 0; i < count; i++)
                s = s + array[i] + " ";

            return s;
        }
    }
