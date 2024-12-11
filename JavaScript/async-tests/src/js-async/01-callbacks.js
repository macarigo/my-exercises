/**
 * Invoke the callback and return the amount of time in miliseconds it took to execute
 */
exports.profileFunc = function (cb) {
    const startTimer = Date.now();
    cb();
    const stopTimer = Date.now();
    return executionTime = stopTimer - startTimer;
};

/**
 * Invoke the async callback with the provided value after some delay
 */
exports.returnWithDelay = function (value, delay, cb) {
    setTimeout(() => {
        cb(null, value);
    }, delay);
};

/**
 * Invoke the async callback with an error after some delay
 */
exports.failWithDelay = function (delay, cb) {
    setTimeout(() => {
        if (error = true) {
            cb(new Error('Async operation failed!'))
            return;
        }
        cb(null, data);
    }, delay);
};

/**
 * Return a promise that resolves after the specified delay
 * or rejects if the delay is negative or non-existent
 */
exports.promiseBasedDelay = function (delay) {

    return new Promise(function (resolve, reject) {
        if (delay < 0) {
           return reject(new Error());
        }
        // some async request that wil return a value
        setTimeout(resolve, delay);
    })


}

