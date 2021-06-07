#!/usr/bin/env python3
# -*- coding: utf-8 -*-
"""
Created on Tue Jun  8 00:27:51 2021

@author: kakatuahitam
"""

from studyclub import app

@app.route('/')
def index():
    return '<h1>Finally, you are here</h1>'
