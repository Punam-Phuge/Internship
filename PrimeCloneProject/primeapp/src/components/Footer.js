import React from "react";
import  "./Footer.css";
import Primelogo from "./images/Primelogo.svg";

export const Footer = () => {
    return (
        <div className="footer1_mainDiv">
            <div className="footer1_topDiv">
                <img className="footer1_img" src={Primelogo} alt="" />

            </div>
            <div className="footer1_bottomDiv">
                <div className="footer1_bottomDiv_font">
                    Terms and Privacy Notice
                </div>
                <div className="footer1_bottomDiv_font">
                    Send us feedback
                </div>
                <div className="footer1_bottomDiv_font">Help</div>
                <div className="footer1_bottomDiv_4">
                    © 1996-2021, MyAmazon.com, Inc. or its affiliates
                </div>
            </div>
        </div>
    );

}; 