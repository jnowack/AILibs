
    package de.upb.crc901.automl.multiclass.evaluablepredicates.mlplan.pp.as.MiniBatchDictionaryLearning;
    /*
        n_jobs : int,
        number of parallel jobs to run


    */

    import de.upb.crc901.automl.multiclass.evaluablepredicates.mlplan.NumericRangeOptionPredicate;

    public class OptionsFor_MiniBatchDictionaryLearning_n_jobs extends NumericRangeOptionPredicate {
        
        @Override
        protected double getMin() {
            return 1;
        }

        @Override
        protected double getMax() {
            return 1;
        }

        @Override
        protected int getSteps() {
            return -1;
        }

        @Override
        protected boolean needsIntegers() {
            return true;
        }
    }
    
