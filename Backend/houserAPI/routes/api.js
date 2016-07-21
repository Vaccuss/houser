/**
 * Created by Dean on 19-Jul-16.
 */
var express = require('express');
var router = express.Router();

var jsonobj = [
    {'item': "bob"},
    {'item': "world"},
    {'item': "yepp still more"},
    {'item': "Hello"},
    {'item': "world"},
    {'item': "yepp still more"}
    ];

/* GET home page. */
router.get('/', function (req, res, next) {
    res.send(jsonobj);
});

module.exports = router;
